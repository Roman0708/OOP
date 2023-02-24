package Character;

public class Spearman extends MeleeUnit {
    public Spearman() {

        super.team = true;
        super.speed = 4;
        super.unitType = "Копейщик";
        
    }

    @Override
    public String getInfo() {
        return ("Я копейщик " + super.getName());
    }

    
}
