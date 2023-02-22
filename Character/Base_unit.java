package Character;
import java.util.Random;

import Character.Names.Names;

public abstract class Base_unit implements Interface{

    protected String name;

    protected int hp, maxHP, level, currentStamina, maxStamina, inventoryVolume, maxInventoryVolume, armor, damage;

    protected boolean team;                 //Через булевое значение реализована принадлежность к сторонам конфликта

    protected int position;                 //Юниты размещаются на одной числовой прямой

    public Base_unit(int maxHpValue, int levelValue, int staminaValue, boolean teamValue, int maxinventoryVolumeValue,
    int armorValue, int damageValue, int positionValue, String unitname) {
        maxHP = maxHpValue;
        this.hp = maxHpValue;
        level = levelValue;
        currentStamina = staminaValue;
        team = teamValue;
        maxInventoryVolume = maxinventoryVolumeValue;
        inventoryVolume = maxInventoryVolume;
        armor = armorValue;
        damage = damageValue;
        position = positionValue;
        name = unitname;
    }

    public Base_unit(String name) {
        this(100, 1, 100, true, 100, 0, 0, 0,"");
    }

    public Base_unit() {
        name = createName();
    }

    public String createName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }

    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }
    
    public int getLevel() {
        return this.level;
    }

    public int getPosition() {
        return this.position;
    }

    public int getStamina() {
        return this.currentStamina;
    }

    public void move(int distance) {
        int staminaRequired = distance*this.armor;
        if (this.currentStamina >= staminaRequired) {
            this.position += staminaRequired;
            this.currentStamina -= staminaRequired;
        }
        else System.out.println("Not enough stamina");
    }
    
    public void getDamage(int damage) {  
        this.hp -= damage;
    }

    @Override
    public void step() {};

    @Override
    public String getInfo() {
        return "";};

}
