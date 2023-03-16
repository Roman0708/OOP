package Character;
import java.util.Random;

import Character.Names.MeleeNick;

public abstract class MeleeUnit extends Base_unit {

    protected int damageModifyer;

    public MeleeUnit (int maxHpValue, boolean teamValue, int armorValue, int minDamageValue, int maxDamageValue, 
    int speedValue, int attackValue, int posX, int posY) {
        super(maxHpValue, teamValue, armorValue, minDamageValue, maxDamageValue, 
        speedValue, attackValue, posX, posY);
    }


    public static String getMeleeNick() {
        String name = createName() + " " + String.valueOf(MeleeNick.values()[new Random().nextInt(MeleeNick.values().length-1)]);
        return name;
    }
    
}
