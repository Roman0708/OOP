package Character;
import java.util.Random;

import Character.Names.RangeNick;

public abstract class RangeUnit extends UnitWithAmmo {

    protected int rangeAttack;
    protected int damageModifyer;
    protected int ammoOut;

    public RangeUnit () {
        super.name += " " + this.getRangeNick();
    };

    public int Attack (Base_unit name) {
        int distance = Math.abs(name.getPosition() - this.getPosition());
        super.currentStamina -= this.ammoOut*super.armor/super.level;
        if (distance > this.rangeAttack) {
            int damageGiven = super.damage + (this.damageModifyer / distance) - name.armor;
            super.spendAmmo(this.ammoOut);
            return damageGiven;
        }
        else return 0;
    }

    private String getRangeNick() {
        return String.valueOf(RangeNick.values()[new Random().nextInt(RangeNick.values().length-1)]);
    }
    
}
