public class FishTank {
  public static void main(String[] args) {

    /**
     *     there are 3 kind of fish:
     *      - clownfish, gains 1 gram when fed and has striped color.
     *      - tang, gains 1 gram when fed and can suffer short-term memory loss.
     *      - koi, gains 2 grams when fed.
     *      each fish has a name, weight, color and has a status and feed method.
     *
     *      create an aquarium and take care of your fish.
     *      create a method in the aquarium that feeds all the fish in the aquarium:
     *      increases the weight of every fish with the amount of grams they gain when fed.
     *      Create a method in the aquarium that removes the big fish.
     *      a big fish's weight is at least 11 grams.
     *      the aquarium has a status method it should print the status for each fish.
     */

    Aquarium aquarium = new Aquarium(aquarium);

    aquarium.add(new Koi("Nami", 9, "pink"));
    aquarium.add(new Tang("Dory", 8, "blue", true));
    aquarium.add(new Tang("Bubbles", 10, "yellow", false));
    aquarium.add(new Clownfish("Nemo", 5, "orange", "white"));

    System.out.println(aquarium.status());

    // Nami, weight: 9, color: pink
    // Dory, weight: 8, color: blue, short-term memory loss: true
    // Bubbles, weight: 10, color: yellow, short-term memory loss: false
    // Nemo, weight: 5, color: orange, stripe color: white

    aquarium.feed();
    aquarium.removeOversizedFishes();

    System.out.println(aquarium.status());

    // Dory, weight: 9, color: blue, short-term memory loss: true
    // Nemo, weight: 6, color: orange, stripe color: white
  }
}