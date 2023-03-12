package Character;
import java.util.ArrayList;
import java.util.Random;

import Character.Names.MagicNick;

public abstract class MagicUnit extends Base_unit {
    protected int currentMana, maxMana, healCost, healPower, manaRegen;

    public MagicUnit(int maxHpValue, boolean teamValue, int armorValue, int minDamageValue, int maxDamageValue, 
        int speedValue, int attackValue, int posX, int posY,  int maxMana, int healCostValue, int healPowervalue, int manaRegenValue) {
        super(maxHpValue, teamValue, armorValue, minDamageValue, maxDamageValue, speedValue, attackValue, posX, posY);
        
        this.maxMana = maxMana;
        this.currentMana = maxMana;
        this.healPower = healPowervalue;
        this.manaRegen = manaRegenValue;
        this.healCost = healCostValue;
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

    @Override
    public void step(ArrayList<Base_unit> team1, ArrayList<Base_unit> team2) {
        if (state.equals("Dead")) return;
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).hp < team1.get(i).maxHP && currentMana >= healCost) {
                heal(team1.get(i));
                return;
            }
            else currentMana = (this.currentMana + this.manaRegen == this.maxMana) ? 
                (this.currentMana += this.manaRegen) : this.maxMana;
                
        }
    }
}
