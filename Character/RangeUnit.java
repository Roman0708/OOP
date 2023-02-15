package Character;

public class RangeUnit extends UnitWithAmmo {

    protected int rangeAttack;
    protected int damageModifyer;
    protected int ammoOut;

    public int Attack (Base_unit name) {
        int distance = Math.abs(name.getPosition() - this.getPosition());
        super.currentStamina -= this.ammoOut*armor/super.level;
        if (distance > this.rangeAttack) {
            int damage = this.damage + (this.damageModifyer / distance);
            super.spendAmmo(this.ammoOut);
            return damage;
        }
        else return 0;
    }
    
}
