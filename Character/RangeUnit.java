package Character;
import java.util.ArrayList;
import java.util.Random;

import Character.Names.RangeNick;

public abstract class RangeUnit extends Base_unit {

    protected int rangeAttack;
    protected int damageModifyer;
    protected int ammo;

    public RangeUnit (int maxHpValue, boolean teamValue, int armorValue, int minDamageValue, int maxDamageValue, 
    int speedValue, int attackValue, int posX, int posY, int rangeAttack, int ammo) {
        super(maxHpValue, teamValue, armorValue, minDamageValue, maxDamageValue, 
        speedValue, attackValue, posX, posY);

        this.rangeAttack = rangeAttack;
        this.ammo = ammo;
        super.name = RangeUnit.getRangeNick();

    };

    @Override
    public void step(ArrayList<Base_unit> team1, ArrayList<Base_unit> team2) {
        if (state.equals("Dead") || ammo == 0) return;
        int target = findNearest(team2);
        float damage = (team2.get(target).armor - attack > 0) ? 
            minDamage : (team2.get(target).armor - attack < 0) ? 
            maxDamage : (maxDamage+minDamage)/2;
        team2.get(target).getDamage(damage);

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getInfo().toString().split(":")[0].equals("Фермер") && team1.get(i).state.equals("Stand")) {
                team1.get(i).state = "Busy";
                return;
            }
            else ammo--;
        }
        
    }

    public static String getRangeNick() {
        String name = createName() + " " + String.valueOf(RangeNick.values()[new Random().nextInt(RangeNick.values().length-1)]);
        return name;
    }
    
}
