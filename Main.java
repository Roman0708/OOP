import Character.Sniper;
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
        
    }
    
}
