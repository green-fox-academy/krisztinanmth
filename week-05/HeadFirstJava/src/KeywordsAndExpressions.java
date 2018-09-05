public class KeywordsAndExpressions {
  public static void main(String[] args) {
    //there are 53 reserved keywords in Java, which obviously we cannot use, just if we alter them

    //expressions are building blocks of all java programs

    //a mile is equal to 1.609344 kilometres
    double kilometres = (100 * 1.609344);
    int highScore = 50;

    if (highScore == 50) {
      System.out.println("this is also an expression - just this inside the bracket");
    }

    //statements, white space and indenting
    int myVariable = 50;
    //statement is the entire line ...expression is the myVariable = 50 part
    //the ones below are also statements:
    myVariable++;
    myVariable--;
    System.out.println("this is a test");
  }
}
