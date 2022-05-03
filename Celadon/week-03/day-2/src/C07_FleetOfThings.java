public class C07_FleetOfThings {


    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        fleet.add(milk.toString());

        Thing obstacle = new Thing("Remove the obstacle");
        fleet.add(obstacle.toString());

        Thing stand = new Thing("Stand up");
        stand.complete();
        fleet.add(stand.toString());

        Thing lunch = new Thing("Eat lunch");
        lunch.complete();
        fleet.add(lunch.toString());

        System.out.println(fleet);
    }
}
