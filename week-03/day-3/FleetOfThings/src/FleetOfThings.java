public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing milk = new Thing("Get milk");
        Thing removeTheObstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatLunch = new Thing("Eat lunch");
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        fleet.add(milk);
        fleet.add(removeTheObstacles);
        fleet.add(standUp);
        standUp.complete();
        fleet.add(eatLunch);
        eatLunch.complete();

        System.out.println(fleet);
    }
}