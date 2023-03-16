package Character;

public class Outlaw extends MeleeUnit {

    public Outlaw(String name, Vector2D coords) {
        super(10, false, 3, 2, 4, 
        6, 8, coords.posX, coords.posY);
        this.name = name;
        this.unitType = "Разбойник";
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник: \t").append(Outlaw.super.name)
                .append("\t| ATK:\t").append(Outlaw.super.attack)
                .append("\t| HP:\t").append(Outlaw.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Outlaw.super.coords.posX).append(".").append(Outlaw.super.coords.posY);
    }
}