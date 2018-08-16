public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal("tiger");
        Animal lion = new Animal("lion");
        Animal zebra = new Animal("zebra");
        Animal cat = new Animal("cat");
        Animal pig = new Animal("pig");
        System.out.println(Farm.listOfAnimals);
        tiger.play();
        pig.eat();
        pig.play();
        zebra.drink();
        lion.play();
        cat.play();
        cat.eat();
        Farm.slaughter();
        System.out.println(tiger.hunger + "\n" + lion.hunger + "\n" + zebra.hunger + "\n" + cat.hunger + "\n" + pig.hunger);
        System.out.println(Farm.listOfHungriness);
        System.out.println(Farm.listOfAnimals);

    }
}
