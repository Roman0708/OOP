package Character;
import java.util.Random;

import Character.Names.MagicNick;

public abstract class MagicUnit extends Base_unit {
    protected int currentMana, maxMana, healCost, healPower;

    public MagicUnit() {
        super.name = MagicUnit.getMagicNick();
    }


    // Amount of heal equal to -damage, so it will be used in getDamage
    public float heal (Base_unit name) {
        this.currentMana -= this.healCost;
        if (name.maxHP-name.hp >= this.healPower) {
            return -(name.maxHP-name.hp);
        }
        else return -this.healPower;
    }

    public static String getMagicNick() {
        String name = createName() + String.valueOf(MagicNick.values()[new Random().nextInt(MagicNick.values().length-1)]);
        return name;
    }

}
