package Character;

public class Sniper extends RangeUnit { 

    public Sniper(String name, Vector2D coords) {
        super(15, true, 10, 8, 10, 
        9, 12, coords.posX, coords.posY, 10, 32);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.hp)
                .append(" \t| Arrows:").append(Sniper.super.ammo)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.posX).append(".").append(Sniper.super.coords.posY);
    }

}
