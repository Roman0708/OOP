package Character;

public abstract class UnitWithAmmo extends Base_unit {
    protected int ammo;     //Villager brings ammo to range units
                            //Range units spend ammo
    
    public UnitWithAmmo() {
        this.ammo = 0;
    }

    public int getAmmo() {
        return this.ammo;
    }

    protected boolean takeAmmo(int ammoAmount) {
       if (super.inventoryVolume + ammoAmount <= super.maxInventoryVolume) {
           super.inventoryVolume += ammoAmount;
           this.ammo += ammoAmount;
           return true;
       }
       else return false;
    }

    protected boolean spendAmmo(int ammoAmount) {
        if (this.ammo >= ammoAmount) {
            this.ammo -= ammoAmount;
            return true;
        }
        else return false;
    }
}
