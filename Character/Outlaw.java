package Character;

public class Outlaw extends MeleeUnit {

    public Outlaw() {

        super.team = false;
        super.speed = 6;
        super.unitType = "Разбойник";

    }

    @Override
    public String getInfo() {
        return ("Я разбойник " + super.getName());
    }

}
