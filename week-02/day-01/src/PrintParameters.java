
// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourh")
// ...


public class PrintParameters {
  public static void main(String[] args) {
    printParams(1, 4, 8, 12, 87, 98, 109);
  }

  public static void printParams(int ...a) {
    for (int i: a)
      System.out.println(i + " ");
    System.out.println();
  }
}
