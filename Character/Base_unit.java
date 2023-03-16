package Character;

import java.util.ArrayList;
import java.util.Random;

import Character.Names.Names;

public abstract class Base_unit implements Interface {

    protected String name, unitType;

    protected int maxHP, armor, minDamage, maxDamage, attack, speed;

    protected float hp;

    protected boolean team;                 //Через булевое значение реализована принадлежность к сторонам конфликта

    protected Vector2D coords;

    public String state;

    public Base_unit(int maxHpValue, boolean teamValue, int armorValue, int minDamageValue, int maxDamageValue, 
                    int speedValue, int attackValue, int posX, int posY) {
        this.maxHP = maxHpValue;
        this.hp = maxHpValue;
        this.team = teamValue;
        this.armor = armorValue;
        this.minDamage = minDamageValue;
        this.maxDamage = maxDamageValue;
        this.name = createName();
        this.speed = speedValue;
        coords = new Vector2D(posX, posY);
        state = "Stand";
    }

    public Base_unit(String name) {
        this();
    }

    public Base_unit(boolean teamValue) {
        this();
        team = teamValue;
    }

    public Base_unit() {
        name = createName();
    }

    public static String createName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public String getName() {
        return this.name;
    }

    public int getSpeed() { return this.speed; }
    public float getHp () { return this.hp; }
    
    protected void getDamage(float damage){
        hp -= damage;
        if (hp > maxHP) hp = maxHP;
        if (hp < 0) state = "Dead";
    }


    @Override
    public void step(ArrayList<Base_unit> team1, ArrayList<Base_unit> team2) { }

    protected int findNearest(ArrayList<Base_unit> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords) & !team.get(i).state.equals("Dead")) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    @Override
    public void step() {};

    @Override
    public StringBuilder getInfo() {
        return new StringBuilder();
    }

    @Override
    public String toString() {
        return unitType + " " + name +
                " H:" + Math.round(hp) +
                " D:" + armor +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((minDamage+maxDamage)/2)) +
                " " + state;
    }

    public int[] getCoords() {return new int[]{coords.posX, coords.posY};}

}


