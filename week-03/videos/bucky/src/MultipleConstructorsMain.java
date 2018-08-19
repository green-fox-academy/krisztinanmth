public class MultipleConstructorsMain {
  public static void main(String[] args) {

    MultipleConstructors multipleConstructorsObject = new MultipleConstructors();
    MultipleConstructors multipleConstructorsObject2 = new MultipleConstructors(5);
    MultipleConstructors multipleConstructorsObject3 = new MultipleConstructors(5, 13);
    MultipleConstructors multipleConstructorsObject4 = new MultipleConstructors(5, 13, 43);

    System.out.printf("%s\n", multipleConstructorsObject.toMilitary());
    System.out.printf("%s\n", multipleConstructorsObject2.toMilitary());
    System.out.printf("%s\n", multipleConstructorsObject3.toMilitary());
    System.out.printf("%s\n", multipleConstructorsObject4.toMilitary());
  }
}
