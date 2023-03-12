package Character;
import java.util.Random;

import Character.Names.MeleeNick;

public abstract class MeleeUnit extends Base_unit {

    protected int damageModifyer;

    public MeleeUnit () {
        super.name = MeleeUnit.getMeleeNick();
    };

    public static String getMeleeNick() {
        String name = createName() + String.valueOf(MeleeNick.values()[new Random().nextInt(MeleeNick.values().length-1)]);
        return name;
    }
    
}
