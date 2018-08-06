//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

public class greet {
  public static void main(String[] args) {
    String al = "Greenfox";
    String user = "Krisztina";
    System.out.println(greeting(al));
    System.out.println(greeting(user));
  }

  public static String greeting(String al) {
    String result = "Greetings dear, " + al;
    return result;
  }
}
