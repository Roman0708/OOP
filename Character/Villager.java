package Character;

import java.util.ArrayList;

public class Villager extends Base_unit {

    protected int ammo;

     public Villager(int maxHpValue, boolean teamValue, int armorValue, int minDamageValue, int maxDamageValue, 
     int speedValue, int attackValue, int posX, int posY, int ammo) {
         super(maxHpValue, teamValue, armorValue, minDamageValue, maxDamageValue, 
         speedValue, attackValue, posX, posY);

         this.ammo = ammo;
         super.name = Base_unit.createName();
         
     }

    public Villager(String name, Vector2D coords) {
        super(50, true, 1, 1, 
        1, 3, 1, coords.posX, coords.posY);
        this.ammo = 1;
        this.unitType = "Крестьянин";
    }

    protected void armiger(RangeUnit rangeUnit){  }

    public int getAmmoVillager () {
        return this.ammo;
    }
    public void setAmmoVillager (int ammo) {
        this.ammo = ammo;
    }

    @Override
    public void step(ArrayList<Base_unit> team1, ArrayList<Base_unit> team2) {
        if (!state.equals("Die")) {
            state = "Stand";
        }
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Крестьянин: \t").append(Villager.super.name)
                .append("\t| ATK:\t").append(Villager.super.attack)
                .append("\t| HP:\t").append(Villager.super.hp)
                .append(" \t| Ammo: ").append(Villager.this.ammo)
                .append("\t|").append("\t| (X.Y) : ").append(Villager.super.coords.posX).append(".").append(Villager.super.coords.posY);
    }

}
