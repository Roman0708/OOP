package Character;

public class Crossbowman extends RangeUnit {

    public Crossbowman(String name, Vector2D coords) {
        super(10, false, 3, 2, 
        3, 4, 6, coords.posX, coords.posY, 10, 16);

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалетчик:\t").append(Crossbowman.super.name)
                .append("\t| ATK:\t").append(Crossbowman.super.attack)
                .append("\t| HP:\t").append(Crossbowman.super.hp)
                .append(" \t| Arrows:").append(Crossbowman.super.ammo)
                .append("\t|").append("\t| (X.Y) : ").append(Crossbowman.super.coords.posX).append(".").append(Crossbowman.super.coords.posY);
    }

}
