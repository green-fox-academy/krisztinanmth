//how to build a time class
//time class is a separate class that has a bunch of different time functions
//we will get 3 numbers from the user ... 1 for hour, 1 for minute and 1 for the seconds
//and it will turn it into military time and regular time


public class TimeClassMain {
  public static void main(String[] args) {
    TimeClass timeClassObject = new TimeClass();
    System.out.println(timeClassObject.toMilitary());
    System.out.println(timeClassObject.toString()); 
    timeClassObject.setTime(13,27, 6);
    System.out.println(timeClassObject.toMilitary());
    System.out.println(timeClassObject.toString());

  }
}










