public class MathClassMethodsBucky {
  public static void main(String[] args) {
    //with built-in methods you don't need to create a new object, you just use them

    //.pow() == power method (5 to the 3 power - then in the argument first number is 5 second is 3

    //.abs() == absolute value - how much away from zero your number is

    //.ceil() == rounds up value (always up!!)

    //.floor() == always round sown the number

    //.max() == takes multiple parameters in a single method and puts out the bigger one - maximum

    //.min() == takes multiple parameters in a single method and puts out the smaller one - minimum

    //.sqrt() == puts out the square root number of the parameter you put into the argument
    System.out.println(Math.pow(5, 3));
    System.out.println(Math.abs(-890));
    System.out.println(Math.ceil(7.4));
    System.out.println(Math.floor(7.8));
    System.out.println(Math.max(8.6, 5.2));
    System.out.println(Math.min(8.6, 5.2));
    System.out.println(Math.sqrt(9));
  }
}
