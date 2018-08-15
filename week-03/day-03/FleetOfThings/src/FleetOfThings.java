public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing getMilk = new Thing("Get milk");
    Thing removeTObs = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    standUp.complete();
    Thing eatLunch = new Thing("Eat Lunch");
    eatLunch.complete();

    fleet.add(getMilk);
    fleet.add(removeTObs);
    fleet.add(standUp);
    fleet.add(eatLunch);
    System.out.println(fleet);
  }
}
