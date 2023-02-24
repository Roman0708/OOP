package Character;

public class Priest extends MagicUnit {

    public Priest() {

        super.team = true;
        super.speed = 5;
        super.unitType = "Священник";
    }

    @Override
    public String getInfo() {
        return (unitType + " " + super.getName());
    }

}
