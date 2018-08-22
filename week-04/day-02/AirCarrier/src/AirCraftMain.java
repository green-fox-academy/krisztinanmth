public class AirCraftMain {
  public static void main(String[] args) {

    Carrier lexington = new Carrier(1000, 3000);
    Carrier nimitz = new Carrier(1000, 3000);
    F16 f16nick1 = new F16();
    F16 f16nick2 = new F16();
    lexington.addAirCraft(f16nick1);
    nimitz.addAirCraft(f16nick2);
  }
}