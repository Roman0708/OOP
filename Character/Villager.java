package Character;

public class Villager extends UnitWithAmmo {

     public void giveAmmo(UnitWithAmmo name, int itemValue) {          //Only Villager can bring ammo to each other

     }

     public Villager() {
        super.speed = 3;
        super.unitType = "Крестьянин";
     }

    public Villager(boolean teamValue) {
        this();
        team = teamValue;
    }

     public boolean pickAmmoOnBase() {
        if (super.getPositionX() == 0 & super.getPositionY() == 0 & super.takeAmmo(50) == true) {        //Villager can pick ammo on base
            return true;
        }
        else return false;
     }

     @Override
    public String getInfo() {
        return ("Я крестьянин " + super.getName());
    }

}
