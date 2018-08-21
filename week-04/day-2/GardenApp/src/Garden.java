import java.util.ArrayList;

class Garden {
    static ArrayList<Flower> flowers = new ArrayList<>();
    static ArrayList<Tree> trees = new ArrayList<>();

    Garden() {
        Flower flower = new Flower("yellow");
        flowers.add(flower);
        Flower flower1 = new Flower("blue");
        flowers.add(flower1);
        Tree tree = new Tree("purple");
        trees.add(tree);
        Tree tree1 = new Tree("orange");
        trees.add(tree1);
    }

    void info() {
        for (Flower flower : flowers) {
            if (flower.getGetWaterAmount() < Flower.limit) {
                System.out.println("The " + flower.getColor() + " Flower needs water");
            } else {
                System.out.println("The " + flower.getColor() + " Flower doesn't need water");

            }
        }
        for (Tree tree : trees) {
            if (tree.getGetWaterAmount() < Tree.limit) {
                System.out.println("The " + tree.getColor() + " Tree needs water");
            } else {
                System.out.println("The " + tree.getColor() + " Tree doesn't need water");
            }
        }
        System.out.println();
    }

    void watering(int wateringAmount) {
        int perPlant = wateringAmount / (flowers.size() + trees.size());
        System.out.println("Watering with " + wateringAmount);
        for (int i = 0; i < flowers.size(); i++) {
            flowers.get(i).watering(perPlant);
        }
        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).watering(perPlant);
        }
        info();
    }
}
