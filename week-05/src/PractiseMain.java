public class PractiseMain {
  public static void main(String[] args) {
    String name = "krisztina";
    System.out.println("hello " + name);


    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    double codingHDaily = 6;
    int semesterLength = 17;
    double workingDays = 5;
    double codingHoursInSemester = codingHDaily * semesterLength * workingDays;
    System.out.println(codingHoursInSemester);
    int workingHoursInSemester = 52 * 17;
    double codingHPercentage = (codingHoursInSemester / workingHoursInSemester * 100);
    System.out.println(codingHPercentage);
  }
}
