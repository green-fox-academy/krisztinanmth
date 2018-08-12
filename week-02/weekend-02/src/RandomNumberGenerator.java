import java.util.Random;

public class RandomNumberGenerator {
  public static void main(String[] args) {
    //creating a program to roll a dice
    //creating object - name: dice
    Random dice = new Random();
    int number;
    for (int counter = 1; counter < 10 ; counter++) {
      number = 1 + dice.nextInt(6); //6 options so dice goes from 0 to 5 ... so we added 1 to the beginning to have the numbers from 1 to 6
      System.out.println(number + " ");
    }
  }
}
