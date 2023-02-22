package Character;
import java.util.Random;

import Character.Names.MeleeNick;

public abstract class MeleeUnit extends Base_unit {   // Пока не придумал чем они будут отличатся от остальных

    protected int damageModifyer;

    public MeleeUnit () {
        super.name += " " + this.getMeleeNick();
    };

    public int attack(Base_unit name) {

        int damageGiven = super.damage/name.armor + this.damageModifyer;
        return damageGiven;

    }

    private String getMeleeNick() {
        return String.valueOf(MeleeNick.values()[new Random().nextInt(MeleeNick.values().length-1)]);
    }
    
}
