package Character;

public class Magician extends MagicUnit {

    public Magician() {

        super.team = false;

    }

    @Override
    public String getInfo() {
        return ("Я колдун " + super.getName());
    }

}
