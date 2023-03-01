package Character;


public class Vector2D {
    public int posX;
    public int posY;
    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getDistance(Vector2D enemy){
        return (int)Math.sqrt((posX - enemy.posX)*(posX - enemy.posX) + (posY - enemy.posY)*(posY - enemy.posY));
    }


}