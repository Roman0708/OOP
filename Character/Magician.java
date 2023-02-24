package Character;

public class Magician extends MagicUnit {

    public Magician() {

        super.team = false;
        super.speed = 9;
        super.unitType = "Колдун";

    }

    @Override
    public String getInfo() {
        return ("Я колдун " + super.getName());
    }

}
