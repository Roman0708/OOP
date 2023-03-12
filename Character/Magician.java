package Character;

public class Magician extends MagicUnit {

    public Magician(String name, Vector2D coords) {
        super(30, false, 12, -5, -5, 9, 17, 
        coords.posX, coords.posY, 30, 10, 10, 3);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Magician.super.name)
                .append("\t| ATK:\t").append(Magician.super.attack)
                .append("\t| HP:\t").append(Magician.super.hp)
                .append(" \t| MP:\t").append(Magician.super.currentMana)
                .append("\t|").append("\t| (X.Y) : ").append(Magician.super.coords.posX).append(".").append(Magician.super.coords.posY);
    }

}
