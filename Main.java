import java.util.ArrayList;
import java.util.Random;

import Character.Base_unit;
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


        ArrayList<Base_unit> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            int index = new Random().nextInt(7);
                switch(index) {
                    case 0:
                        list.add(new Villager());
                        break;
                    case 1:
                        list.add(new Spearman());
                        break;
                    case 2:
                        list.add(new Outlaw());
                        break;
                    case 3:
                        list.add(new Sniper());
                        break;
                    case 4:
                        list.add(new Crossbowman());
                        break;
                    case 5:
                        list.add(new Magician());
                        break;
                    case 6:
                        list.add(new Priest());
                        break;
                }

            System.out.println(list.get(i).getInfo());
        }
    }
    
}
