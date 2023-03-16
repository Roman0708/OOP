package Character;

public class Spearman extends MeleeUnit {
    public Spearman(String name, Vector2D coords) {
        super(10, true, 5, 1, 3, 
        4, 4, coords.posX, coords.posY);
        this.name = name;
        this.unitType = "Копейщик";
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.posX).append(".").append(Spearman.super.coords.posY);
    }

    
}
