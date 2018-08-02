public class Cuboid {
  public static void main(String[] args) {

    double a = 20;
    double b = 34;
    double c = 67;

    double SurfaceArea = (a * b + a * c + b * c) * 2;
    double Volume = a * b * c;

    System.out.println("Surface Area: " + SurfaceArea);
    System.out.println("Volume: " + Volume);

  }
}
