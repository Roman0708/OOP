package Character;
import java.util.ArrayList;
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

    @Override
    public void step(ArrayList<Base_unit> team1, ArrayList<Base_unit> team2) {
        if (state.equals("Dead")) return;
        int target = findNearest(team2);
        
        if (coords.getDistance(team2.get(target).coords) < 2) 
        {
            float damage = (team2.get(target).armor - attack > 0) ? 
                minDamage : (team2.get(target).armor - attack < 0) ? 
                maxDamage : (maxDamage+minDamage)/2;
            team2.get(target).getDamage(damage);
        }
        else {
            this.coords.posY = (team2.get(target).getCoords()[1] > getCoords()[1]) ? 
            this.coords.posY += team2.get(target).getCoords()[1] - 2 : 
            this.coords.posY - team2.get(target).getCoords()[1] + 2;
        }
    }

}
