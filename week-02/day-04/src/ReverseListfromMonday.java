import java.util.Arrays;

public class ReverseListfromMonday {

  public static void main(String[] args) {

    //creating array
    int aj[] = {3, 4, 5, 6};

    //for loop for reversing order of elements
    for (int i = aj.length - 1; i >= 0; i--) {

      System.out.print(aj[i] + ", ");
      //this is not good as it just prints out the array in reversed order but did not reverse the order inside the array
    }
  }
}
