package Character;

public class Villager extends UnitWithAmmo {

     public void giveAmmo(UnitWithAmmo name, int itemValue) {          //Only Villager can bring ammo to each other

     }

     public boolean pickAmmoOnBase() {
        if (super.getPosition() == 0 & super.takeAmmo(50) == true) {        //Villager can pick ammo on base
            return true;
        }
        else return false;
     }

     @Override
    public String getInfo() {
        return ("Я крестьянин " + super.getName());
    }

}
