public class BattleApp {
    public static void main(String[] args) {
        Ship Nessy = new Ship();
        Ship James = new Ship();

        if (James.battle(Nessy)) {
            System.out.println("James win");
        } else {
            System.out.println("Nessy win");

        }
    }
}
