//how to build a time class
//time class is a separate class that has a bunch of different time functions
//we will get 3 numbers from the user ... 1 for hour, 1 for minute and 1 for the seconds
//and it will turn it into military time and regular time

public class TimeClass {
  private int hour;
  private int minute;
  private int second;

  //method for checking the numbers
  public void setTime(int h, int m, int s) {
    //as the user needs enter numbers between 1-24 for hours, 1-60 for minutes and second, we're gonna check the input
    hour = ((h >= 0 && h < 24) ? h : 0);
      //above the question mark means - are these two conditions met if yes - that is the hour variable if not it's zero
      // basically an if statement
    minute = ((m >= 0 && m < 60) ? m : 0);
    second = ((s >= 0 && s < 60) ? s : 0);
  }

  public String toMilitary() {
    return String.format("%02d:%02d:%02d", hour, minute, second );
  }
  //method for displaying regular time
  public  String toString() {
   return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM" ));
  }
}





























