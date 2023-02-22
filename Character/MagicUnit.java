package Character;
import java.util.Random;

import Character.Names.MagicNick;

public abstract class MagicUnit extends Base_unit {
    protected int currentMana, maxMana, healCost, healPower;

    public MagicUnit() {
        super.name += " " + this.getMagicNick();
    }


    // Amount of heal equal to -damage, so it will be used in getDamage
    public int heal (Base_unit name) {
        this.currentMana -= this.healCost;
        if (name.maxHP-name.hp >= this.healPower) {
            return -(name.maxHP-name.hp);
        }
        else return -this.healPower;
    }

    public String getMagicNick() {
        return String.valueOf(MagicNick.values()[new Random().nextInt(MagicNick.values().length-1)]);
    }

}
