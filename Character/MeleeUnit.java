package Character;

public class MeleeUnit extends Base_unit {   // Пока не придумал чем они будут отличатся от остальных
    
    protected int damageModifyer;

    public int attack(Base_unit name) {

        int damageGiven = super.damage/armor + this.damageModifyer;
        return damageGiven;
        
    }
    
}
