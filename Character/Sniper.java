package Character;

public class Sniper extends RangeUnit { 

    public Sniper() {

        super.speed = 9;
        super.rangeAttack = 40;
        super.damage = 40;
        super.ammo = 50;
        super.damageModifyer = 30;
        super.ammoOut = 10;
        super.armor = 5;
        super.team = false;
        super.unitType = "Снайпер";

    }
    
    @Override
    public String getInfo() {
        return ("Я снайпер " + super.getName());
    }

}
