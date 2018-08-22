public class Main {
    public static void main(String[] args) {
        Domino domino1 = new Domino(6, 4);
        Domino domino2 = new Domino(6, 4);
        System.out.println(domino1.compareTo(domino2));
        if (domino1.compareTo(domino2) > 0) {
            System.out.println("Domino1 is greater than Domino 2");
        } else if (domino1.compareTo(domino2) < 0) {
            System.out.println("Domino1 is lesser than Domino 2");
        } else {
            System.out.println("Domino1 is equal to Domino 2");
        }
    }
}
