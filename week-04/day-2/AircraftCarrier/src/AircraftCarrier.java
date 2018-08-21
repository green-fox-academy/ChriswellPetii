import Aircrafts_Carrier.Aircraft;
import Aircrafts_Carrier.F16;
import Aircrafts_Carrier.F35;

import java.util.ArrayList;

class AircraftCarrier {
    private int random = (int) Math.ceil(Math.random() * 20);
    private ArrayList<Aircraft> airCrafts = new ArrayList<>(random);
    private int airCraftAmmo;
    private int health;
    private int gotDamage;
    private int F35n = (int) (random * 0.6);
    private int F16n = random - F35n;

    AircraftCarrier(int airCAmmo, int health) {
        this.airCraftAmmo = airCAmmo;
        this.health = health;
    }

    private void add() {
        for (int i = 0; i < F35n; i++) {
            F35 aircraft = new F35();
            airCrafts.add(aircraft);
        }
        for (int i = 0; i < F16n; i++) {
            F16 aircraft = new F16();
            airCrafts.add(aircraft);
        }
    }

    private void fill() {
        int needed = 0;
        for (Aircraft aircraft : airCrafts) {
            needed += aircraft.getAmmo();
        }
        if (airCraftAmmo > needed) {
            for (Aircraft aircraft : airCrafts) {
                aircraft.refill(airCraftAmmo);
            }
        } else if (airCraftAmmo == 0) {
            throw new IndexOutOfBoundsException("Out of Ammo");
        }
    }

    private void fight(AircraftCarrier aircraftCarrier) {
        int fire = 0;
        for (Aircraft airCraft : this.airCrafts) {
            fire += airCraft.getDamage();
        }
        aircraftCarrier.health -= fire;
        getStatus();
    }

    private void getStatus() {
        System.out.println("HP: " + health + ", Aircraft count: " + airCrafts.size() + ", Ammo Storage: " + airCraftAmmo + ", Total damage: " + gotDamage);
        System.out.println("Aircraft:");
        for (Aircraft airCraft : airCrafts) {
            airCraft.getStatus();
        }
        if (this.health > 0) {
            System.out.println("It's dead Jim :(");
        }
    }
}
