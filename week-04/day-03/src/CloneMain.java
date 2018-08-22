public class CloneMain {
  public static void main(String[] args) {
    Student johnny = new Student("John", 20, "male", "BME");
    Student johnnyClone = johnny.clone();
    System.out.println(johnnyClone.name);
    System.out.println(johnny.name);
    System.out.println(johnnyClone);
    System.out.println(johnny);
    Student kriszta = new Student("krisz", 21, "female", "null");
    Student krisztaClone = kriszta.clone();
    System.out.println(kriszta);
    System.out.println(krisztaClone);
  }
}
