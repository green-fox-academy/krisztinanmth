//Create a PostIt class that has
//    a backgroundColor
//    a text on it
//    a textColor
public class MyPostIts {
  String backgroundColor;
  String text;
  String textColor;

  public void displayPostIts() {
    System.out.print(backgroundColor + ",   ");
    System.out.print(text + ",   ");
    System.out.println(textColor + ",   ");
    System.out.println();
  }
}