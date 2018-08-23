public class AirCraftMain {
  public static void main(String[] args) {

    Carrier lexington = new Carrier(1000, 5000);
    Carrier nimitz = new Carrier(1000, 5000);
    F16 f16nick1 = new F16();
    F16 f16nick2 = new F16();
    lexington.addAirCraft(f16nick1);
    nimitz.addAirCraft(f16nick2);
    F16 f16nick3 = new F16();
    F16 f16nick4 = new F16();
    lexington.addAirCraft(f16nick3);
    nimitz.addAirCraft(f16nick4);
    F35 f35charlie1 = new F35();
    F35 f35charlie2 = new F35();
    lexington.addAirCraft(f35charlie1);
    nimitz.addAirCraft(f35charlie2);

//    lexington.fill();
//    nimitz.fill();
//    lexington.getStatus();
//    nimitz.getStatus();
//    lexington.carrierFight(nimitz);
//
//    lexington.fill();
//    nimitz.fill();
//    lexington.getStatus();
//    nimitz.getStatus();
//    lexington.carrierFight(nimitz);

    lexington.getStatus();
    nimitz.getStatus();
  }
}