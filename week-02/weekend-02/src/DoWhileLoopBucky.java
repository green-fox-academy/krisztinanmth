public class DoWhileLoopBucky {
  public static void main(String[] args) {
    int counter = 0;
    do {
      System.out.println(counter);
      counter++;
    } while (counter <= 10);
  }
}
//here because i use a do while loop, the first part of the program always runs once even if the statement in the
//while brackets is false ... ig if my counter is set to 15, the system will put 15 out once
// in this case when counter is set to 0 it prints out the numbers from 0 to 10 as the while loop is true 11 times

//so use a do while loop every time you want to do sg at least once

//use a while loop any time u want to test it first and run it if the test is true
