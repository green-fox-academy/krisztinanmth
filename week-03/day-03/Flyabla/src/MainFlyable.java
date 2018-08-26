public class MainFlyable {
  public static void main(String[] args) {
    Helicopter heli = new Helicopter("eurocopter tiger", "black", 365);
    Helicopter heli2 = new Helicopter("cj", "military", 460);
    System.out.println(heli.fly());
    System.out.print(heli.land() + ", ");
    System.out.print(heli.takeOff());
    System.out.println();
    System.out.println(heli2.fly());
    System.out.print(heli2.land() + ", ");
    System.out.print(heli2.takeOff());
    System.out.println();
    Bird eagle = new Bird("eagle", "black", 233);
    System.out.println(eagle.fly());
    System.out.println(eagle.land());
    System.out.println(eagle.takeOff());
  }
}
