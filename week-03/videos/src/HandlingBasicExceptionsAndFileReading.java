import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HandlingBasicExceptionsAndFileReading {
  public static void main(String[] args) {

    //we are opening a file with Scanner now, so in the () we don't put System.in now
    Scanner sc = new Scanner(System.in);

    File file = new File("videos.iml");
    //we can do bunch of things with file - eg. check if it's a directory - so here files are also directories


    //we can check if file exists - this will return a boolean
    file.exists();
    System.out.println(file.exists());
    //we can check if we can read the file or write it
    //we don't need to put these checkings in the try as there ar no exceptions for that
    System.out.println(file.canRead() + ", " + file.canWrite());
    //we can also check a bunch of other stuff ...just check file. and method it gives

    try {
      Scanner anotherSc = new Scanner(file);
      while (anotherSc.hasNext()) {
        //this is how we scan one line
        System.out.println(anotherSc.nextLine()); //this prints out next line, which is now the first
        //so if we want to print out all the lines we need a loop for that
      } //after we scanned the files it's a good habit to close the scanner
      anotherSc.close(); //we closed scanner

    } catch (IOException ex) {

    }//we can have any number of catch blocks - there are a few rules to follow with multiple catches
     //you need to start with the most specific one and leave the most general at the end
     // this (Exception ex) below catches all exceptions the one above (IOException ex) is the more specific one
    //catch (Exception ex) {
    //the easy way to get used to handling exceptions is by handling files
    //with scanning like file reading many things can go wrong
  }
}



























