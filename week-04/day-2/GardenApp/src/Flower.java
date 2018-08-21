class Flower extends Plant {
    static int limit = 5;

    Flower(String color) {
        super(color, Flower.limit, 0.75);
    }
}
