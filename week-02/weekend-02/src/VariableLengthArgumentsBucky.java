//with methods we need to tell it what arguments to take
//but sometimes we don't know that
//this is the way to make a method, which takes any arguments we want it use the ...
//so any time you don't know how many arguments you want to throw at a method, just give the type then 3 dots then a variable name, with which you work inside the method


public class VariableLengthArgumentsBucky {
  public static void main(String[] args) {
    System.out.println(average(43, 56, 76, 8, 65, 2, 31));
  }

  public  static int average(int...numbers) {
    //the three dots ... before the numbers tells the method that we don't know now how many numbers we will throw at it
    int total = 0;
    for (int x : numbers) {
      total += x;
    }
    return total / numbers.length;
  }
}
