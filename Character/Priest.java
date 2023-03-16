package Character;

public class Priest extends MagicUnit {

    public Priest(String name, Vector2D coords) {
        super(30, true, 7, -4, -4, 5, 12, 
        coords.posX, coords.posY, 40, 10, 10, 2);
        this.name = name;
        this.unitType = "Монах";
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Priest.super.name)
                .append("\t| ATK:\t").append(Priest.super.attack)
                .append("\t| HP:\t").append(Priest.super.hp)
                .append(" \t| MP:\t").append(Priest.super.currentMana)
                .append("\t|").append("\t| (X.Y) : ").append(Priest.super.coords.posX).append(".").append(Priest.super.coords.posY);
    }

}
