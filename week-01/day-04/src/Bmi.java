public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;

    double heightSquared = Math.pow(heightInM, 2);
    double BMI = (massInKg / heightSquared);

    System.out.println(BMI);
  }
}
