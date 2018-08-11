import java.util.Scanner;

public class BuckyVideos {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int tuna = 5;
    int bass = 18;
    System.out.println(tuna++);
    System.out.println(tuna);
    System.out.println(++tuna);

    int boy, girl;
    boy = 18;
    girl = 40;
    if (boy > 10 && girl < 60) {
      System.out.println("You can enter");
    } else {
      System.out.println("You can not enter");
    }

    //switch statement
    int age;
    age = 8;

    switch (age) {
      case 1:
        System.out.println("You can crawl");
        break;
      case 2:
        System.out.println("You can talk");
        break;
      case 3:
        System.out.println("You can get in trouble");
        break;
      default:
        System.out.println("I don't know how old you are");
        break;
    }

    //while loop
    int counter = 0;
    while (counter < 10) {
      System.out.println(counter);
      counter++;
    }


  }
}
