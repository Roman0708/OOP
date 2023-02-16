import Character.Crossbowman;
import Character.Magician;
import Character.Outlaw;
import Character.Priest;
import Character.Sniper;
import Character.Spearman;
import Character.Villager;

public class Main {
    public static void main(String[] args) {
        Villager villager1 = new Villager();
        villager1.pickAmmoOnBase();
        System.out.println(villager1.getAmmo());

        Sniper sniper2 = new Sniper();
        System.out.println(String.format("Current sniper's position: %d, current sniper's stamina: %d", sniper2.getPosition(), sniper2.getStamina()));
        sniper2.move(20);
        System.out.println(String.format("Current sniper's position: %d, current sniper's stamina: %d", sniper2.getPosition(), sniper2.getStamina()));
        
        Crossbowman crossbowman = new Crossbowman();

        Priest priest = new Priest();

        Magician magician = new Magician();

        Spearman spearman = new Spearman();

        Outlaw outlaw = new Outlaw();
    }
    
}
