//Math.random() method video - bucky
import java.util.Random;

public class apples {

  public static void main(String[] args) {

    //method for generating random numbers

    //creating an object
    Random dice = new Random();

    //creating int which will store the number output by the dice
    int number;

    //rolling the dice 10 times - for loop
    for(int counter = 1; counter <= 10; counter++) {
      number = 1 + dice.nextInt(6);
      //as we used 6 above all are random numbers will be between 0-5 = 6 options
      // so we put the 1+ at the beginning as we want numbers from 1-6

      System.out.println(number + " ");
    }
  }
}
