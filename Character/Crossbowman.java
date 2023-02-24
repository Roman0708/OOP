package Character;

public class Crossbowman extends RangeUnit {

    public Crossbowman() {


        speed = 4;
        super.rangeAttack = 30;
        super.damage = 30;
        super.ammo = 20;
        damageModifyer = 20;
        ammoOut = 1;
        super.armor = 10;
        super.team = true;
        super.unitType = "Арбалетчик";

    }

    @Override
    public String getInfo() {
        return ("Я арбалетчик " + super.getName());
    }

}
