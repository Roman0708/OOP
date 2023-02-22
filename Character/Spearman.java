package Character;

public class Spearman extends MeleeUnit {
    public Spearman() {

        super.team = true;
        
    }

    @Override
    public String getInfo() {
        return ("Я копейщик " + super.getName());
    }

    
}
