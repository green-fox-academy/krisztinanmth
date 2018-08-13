import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewHandlingExceptionsAndFileReading {

  public static void main(String[] args) {
    //in the new Java8 version we don't have File anymore - instead we have Path
    // we are not creating a new path, so we don't say new here we have a bunch of paths
    // and we want to get one so we use .get
    //path is a utility class - couple of useful methods collected into one place
    Path path = Paths.get("videos.iml");
    // again we have bunch of methods if we use path. and check the methods that come up

    //we have another utility class called Files
    //with these we can do everything we did in previous part ... same java name in videos ... and much more
    //we still need to do the try and catch part though

    //all the checkings returns booleans again
    Files.isReadable(path);
    Files.isWritable(path);
    Files.isDirectory(path);
    try{
      for(String line : Files.readAllLines(path)){ //i could put videos.iml here i don't need to declare it somewhere else
        System.out.println(line.toUpperCase());
        //if i use .toUpperCase - that just changes the output... if i want to save it i need to create a list for that

      }

      Files.lines(Paths.get("videos.iml"))
          .map(line -> line.toUpperCase()) //now it will be uppercase as we added it
          .filter(line -> line.startsWith(" ")) // with this one i filter the lines and just print out the ones, which have space
          // or i can reverse filter ! ... as in: .filter(line -> !line.startsWith(" "))
          .forEach(line -> System.out.println(line));
      //this prints out all the lines, but now without the uppercase, as we did not ask for that


      //we can write lines from above into path
      //Files.write(path, lines);

     //bunch of other methods with Files. - check them, play around

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
