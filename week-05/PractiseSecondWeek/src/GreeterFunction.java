public class GreeterFunction {
  public static void main(String[] args) {
    // - Create a string variable named `al` and assign the value `Greenfox` to it
    // - Create a function called `greet` that greets it's input parameter
    //     - Greeting is printing e.g. `Greetings dear, Greenfox`
    // - Greet `al`
    String al = "greenfox";
    greet(al);
  }

  public static void greet(String name) {
    System.out.println("greetings dear, " + name);
  }
}
