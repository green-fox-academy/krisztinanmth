public class PrintArguments {
  public static void main(String[] args) {
    // - Create a function called `printParams`
    //   which prints the input String parameters
    // - It can have any number of parameters

    // Examples
    // printParams("first")
    // printParams("first", "second")
    // printParams("first", "second", "third", "fourh")
    // ...
    printParams("a", "b", "first", "laNinja");
  }

  public static void printParams(String... stringParams) {
    System.out.println("number of arguments provided: " + stringParams.length);
    System.out.println("============================");
    for (int i = 0; i < stringParams.length ; i++) {
      System.out.print(stringParams[i] + ", ");
    }
  }
}
