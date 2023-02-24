import java.util.ArrayList;
import java.util.Comparator;
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

    // 1
    public static void main(String[] args) {
        // Villager villager1 = new Villager();
        // villager1.pickAmmoOnBase();
        // System.out.println(villager1.getAmmo());

        // Sniper sniper2 = new Sniper();
        // System.out.println(String.format("Current sniper's position: %d, current
        // sniper's stamina: %d", sniper2.getPosition(), sniper2.getStamina()));
        // sniper2.move(20);
        // System.out.println(String.format("Current sniper's position: %d, current
        // sniper's stamina: %d", sniper2.getPosition(), sniper2.getStamina()));

        // 2
        // ArrayList<Base_unit> list = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {

        // int index = new Random().nextInt(7);
        // switch(index) {
        // case 0:
        // list.add(new Villager());
        // break;
        // case 1:
        // list.add(new Spearman());
        // break;
        // case 2:
        // list.add(new Outlaw());
        // break;
        // case 3:
        // list.add(new Sniper());
        // break;
        // case 4:
        // list.add(new Crossbowman());
        // break;
        // case 5:
        // list.add(new Magician());
        // break;
        // case 6:
        // list.add(new Priest());
        // break;
        // }

        // System.out.println(list.get(i).getInfo());
        // }

        // 3
        ArrayList<Base_unit> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            int index = new Random().nextInt(4);
            switch (index) {
                case 0:
                    team1.add(new Villager());
                    break;
                case 1:
                    team1.add(new Spearman());
                    break;
                case 2:
                    team1.add(new Magician());
                    break;
                case 3:
                    team1.add(new Sniper());
                    break;
            }
        }

        ArrayList<Base_unit> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            int index = new Random().nextInt(4);
            switch (index) {
                case 0:
                team2.add(new Villager(false));
                    break;
                case 1:
                team2.add(new Outlaw());
                    break;
                case 2:
                team2.add(new Priest());
                    break;
                case 3:
                team2.add(new Crossbowman());
                    break;
            }
        }

        ArrayList<Base_unit> units = new ArrayList<>();
        units.addAll(team1);
        units.addAll(team2);
        units.sort(new Comparator<Base_unit>() {

            @Override
            public int compare(Base_unit o1, Base_unit o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });


        for (int i = 0; i < units.size(); i++) {
            units.get(i).fullInfo();         
        }

    }

}
