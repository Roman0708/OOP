package Character;

public class MagicUnit extends Base_unit {
    protected int currentMana, maxMana, healCost, healPower;


    // Amount of heal equal to -damage, so it will be used in getDamage
    public int heal (Base_unit name) {
        this.currentMana -= this.healCost;
        if (name.maxHP-name.hp >= this.healPower) {
            return -(name.maxHP-name.hp);
        }
        else return -this.healPower;
    }
}
