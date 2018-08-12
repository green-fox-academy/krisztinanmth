import java.util.Random;

public class ArraysBucky {
  //an array can only store values of the same data-type
  //an array in a single variable, which stores multiple variables of the same type
  public static void main(String[] args) {
    //syntax for creating an array called bucky with 10 integers
    int bucky[] = new int[10];
    bucky[0] = 87;
    bucky[1] = 543;
    bucky[2] = 90;
    bucky[3] = 7;
    bucky[4] = 6;
    bucky[5] = 3;
    bucky[6] = 99;
    bucky[7] = 69;
    bucky[8] = 1;
    bucky[9] = 13;

    int bucky2[] = {2, 4, 5, 7, 9};

    //to print out index 6 of bucky:
    System.out.println(bucky[6]);
    //for bucky2 the same
    System.out.println(bucky2[2]);

    //creating an array table
    System.out.println("Index \t Value");
    int bucky3[] = {32, 12, 18, 54, 2};

    //now we make a for loop, which will loop through all our elements in the array and puts them out into the array table
    //index is the counter in the for loop
    for (int counter = 0; counter < bucky3.length; counter++) {
      System.out.println(counter + " \t \t " + bucky3[counter]);
    }

    //summing elements of arrays
    int bucky4[] = {21, 16, 86, 21, 3};
    int sum = 0;

    for (int counter = 0; counter < bucky4.length ; counter++) {
      sum += bucky4[counter];
    }
    System.out.println("the sum of these numbers is: " + sum);


    //array elements as counters
    Random myRandomObject = new Random();               //for this we imported Random on top
    int frequency[] = new int[7];                       //we made an array, called frequency with 7 elements
    for (int roll = 1; roll < 1000 ; roll++) {
      ++frequency[1 + myRandomObject.nextInt(6)]; // we made roll to generate numbers from 0 to five but we added 1 at the beginning, so we are generating numbers from 1 - 6
    }
    System.out.println("Face \t Frequency");            //here we made a header
    for (int face = 1; face < frequency.length ; face++) {
      System.out.println(face + " \t  \t " + frequency[face]); //here we output face that is the number from 1 - 6 and frequency - how many
    }                                                          //times that number was rolled with the dice (altogether we rolled 1000 times in the first for loop
  }
}
