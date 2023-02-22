package Character;

public class Priest extends MagicUnit {

    public Priest() {

        super.team = true;
    }

    @Override
    public String getInfo() {
        return ("Я священник " + super.getName());
    }

}
