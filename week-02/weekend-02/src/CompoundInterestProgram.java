public class CompoundInterestProgram {
  public static void main(String[] args) {
    //formula for compund interest Amount = (principal + Rate)^n ....n is the number of years
    //here principal is 10000 as bucky has 10000 followers on youtube right now
    //Rate is 0.1 as bucky's followers increase 1% per day
    double amount;
    double principal = 10000;
    double rate = .01;

    for(int day = 1; day <=20; day++) {
      amount = principal * Math.pow(1 + rate, day); //we use Math.pow to put a number on the power of another number like square it
      System.out.println(day + "   " + amount); //usually for compound interest we use year not day
    }
  }
}
