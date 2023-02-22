package Character;

public class Outlaw extends MeleeUnit {

    public Outlaw (){

        super.team = false;
        
    }

    @Override
    public String getInfo() {
        return ("Я разбойник " + super.getName());
    }

}
