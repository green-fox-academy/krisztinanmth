

public class TakesLOnger {

  public static void main(String... args) {
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // method 1 - with substring
    System.out.println(quote.indexOf("It "));
    String newquote;
    newquote = quote.substring(0,21) + "always takes longer than " + quote.substring(21);
    System.out.println(newquote);

    //method 2 - with substring
    System.out.println(quote.substring(0, quote.indexOf("you")) + "always takes longer than " + (quote.substring(quote.indexOf("you"))));

    //method 2 - with StringBuilder
    StringBuilder newString = new StringBuilder(quote);
    newString.insert(quote.indexOf("you"), "always takes longer than ");

    System.out.println(newString);
  }
}