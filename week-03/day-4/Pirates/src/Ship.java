import java.util.ArrayList;
import java.util.List;

public class Ship {
    static List<Pirate> pirates = new ArrayList<>();
    int random = (int) Math.ceil(Math.random() * 100);
    int captainsRums = (int) Math.ceil(Math.random() * 10);
    //    int alivePirates = Pirate.numberOfAlivePirates();
    int shipScore;

    Ship() {
        pirates.clear();
        fillShip();
        this.shipScore = Pirate.numberOfAlivePirates() - this.captainsRums;
    }

    void fillShip() {
        Pirate captain = new Pirate(20);
        pirates.add(captain);
        captain.drinkSomeRum(this.captainsRums);
        int i;
        for (i = 1; i < this.random; i++) {
            Pirate pirate = new Pirate(this.random);
            pirates.add(pirate);
        }
    }


    boolean battle(Ship ship) {
        if (this.shipScore > ship.shipScore) {
            celebrate();
            return true;
        } else {
            for (int i = 0; i < (int) Math.ceil(Math.random() * (pirates.size() / 2)); i++) {
                if (pirates.get(i).state == "Died")
                    i++;
                else {
                    pirates.get(i).die();
                }
            }
            return false;
        }
    }

    void celebrate() {
//        System.out.println("Party on the board!!");
//        System.out.println("We have infinite rums!!");
//        System.out.println("We win !");
    }

}
