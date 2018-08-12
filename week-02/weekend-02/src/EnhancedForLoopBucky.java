// so an enhanced loop is really good to loop through all the elements of an arrays

public class EnhancedForLoopBucky {
  public static void main(String[] args) {
    //first we create an array
    int bucky[] = {3, 4, 5, 6, 7};
    //then we create another variable to hold the sum of our array
    int total = 0;

    //now we create the enhanced for loop - it needs two things as parameters - first is the kind of data it gets (type and identifier)
    //and second is the name of the array we want it to work with
    for (int x: bucky) {
      total += x;
      //so the enhance for loop is adding the elements of the array - all of them and then stores it in total
      System.out.println(total);
      //this prints out 3, 7, 12, 18, 25
    }
  }
}
