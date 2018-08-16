public class Pirate {
    String name = "Pirate";
    int health = 100;
    int age;
    int rums;
    int rumDamage = this.rums * 5;
    int brawls = ((int) Math.ceil(Math.random()) * 3);
    String state;

    Pirate(int age) {
        this.age = age;
        if (age >= 30 && age < 45) {
            this.health = 80;
        }
        if (age >= 45) {
            this.health = 70;
        }
        setState();
    }

    public static int numberOfAlivePirates() {
        int counter = 0;
        for (int i = 0; i < Ship.pirates.size(); i++) {
            if (Ship.pirates.get(i).state != "Died") {
                counter++;
            }
        }
        return counter;
    }

    void drinkSomeRum(int i) {
        this.rums += i;
        setState();
        if (this.rumDamage >= this.health) {
            die();
        }
    }

    void drinkSomeRum() {
        this.rums++;
        setState();
        if (rumDamage >= health) {
            die();
        }
    }


    void howsItGoingMate() {
        if (this.rums < 5) {
            System.out.println(this.name + ":\n \"Pour me anudder!\"");
        } else {
            System.out.println(this.name + ": \n \"Arghh, I'ma Pirate. How d'ya d'ink its goin?\"");
        }
    }

    void die() {
        this.health = 0;
        setState();
    }

    void brawl() {
        if (this.brawls == 3) {
            die();
        }
    }

    void setState() {
        if (this.health == 0) {
            this.state = "Died";
        } else {
            this.state = "Alive";
        }
        if (this.rums > 4) {
            this.state = "Passed out";
        }
    }

}
