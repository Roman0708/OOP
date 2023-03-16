import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import Character.Base_unit;
import Character.Crossbowman;
import Character.MagicUnit;
import Character.Magician;
import Character.MeleeUnit;
import Character.Outlaw;
import Character.Priest;
import Character.RangeUnit;
import Character.Sniper;
import Character.Spearman;
import Character.Vector2D;
import Character.Villager;


public class Main {

    static final int UNITS = 10;
    public static ArrayList<Base_unit> allTeam = new ArrayList<>();
    public static ArrayList<Base_unit> holyTeam = new ArrayList<>();
    public static ArrayList<Base_unit> darkTeam = new ArrayList<>();
    public static void main(String[] args) {
        try (Scanner user_input = new Scanner(System.in)) {
            System.out.print("Press Enter to begin.");
            user_input.nextLine();
            createTeam(holyTeam, 0, 1);
            createTeam(darkTeam, 3, 10);
            allTeam.addAll(holyTeam);
            allTeam.addAll(darkTeam);
            sortTeam(allTeam);

            while (true){
                View.view();
                user_input.nextLine();
                for (Base_unit base_unit: allTeam) {
                    if (holyTeam.contains(base_unit)) base_unit.step(holyTeam, darkTeam);
                    else base_unit.step(darkTeam, holyTeam);
                }
            }
        }
    }
    static void createTeam (ArrayList<Base_unit> team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4)+offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(RangeUnit.getRangeNick(), new Vector2D(i + 1, posY)));
                    break;
                case (1):
                    team.add(new Outlaw(MeleeUnit.getMeleeNick(), new Vector2D(i + 1, posY)));
                    break;
                case (2):
                    team.add(new Magician(MagicUnit.getMagicNick(), new Vector2D(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Villager(Base_unit.createName(), new Vector2D(i + 1, posY)));
                    break;
                case (4):
                    team.add(new Crossbowman(RangeUnit.getRangeNick(), new Vector2D(i + 1, posY)));
                    break;
                case (5):
                    team.add(new Priest(MagicUnit.getMagicNick(), new Vector2D(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Spearman(MeleeUnit.getMeleeNick(), new Vector2D(i + 1, posY)));
                    break;
            }
        }
    }

    

    

    static void sortTeam (ArrayList<Base_unit> team){
        team.sort(new Comparator<Base_unit>() {
            @Override
            public int compare(Base_unit t0, Base_unit t1) {
                if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                else  return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }    
}
