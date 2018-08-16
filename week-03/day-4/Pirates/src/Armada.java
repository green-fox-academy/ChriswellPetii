import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> ships = new ArrayList<>();
    int random = (int) Math.ceil(Math.random() * 10);

    Armada() {
        ships.clear();
        fillArmada();
    }

    void fillArmada() {
        int i;
        for (i = 0; i < (int) Math.ceil(Math.random() * 10); i++) {
            Ship ship = new Ship();
            ships.add(ship);
        }
    }

    boolean war(Armada armada) {
        int i = 0;
        int j = 0;
        while (i < this.ships.size() && j < armada.ships.size()) {
            if (this.ships.get(i).battle(armada.ships.get(j))) {
                j++;
            } else {
                i++;
            }
        }
        return i < j;
    }
}
