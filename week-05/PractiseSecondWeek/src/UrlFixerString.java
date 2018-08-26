public class UrlFixerString {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";
    url.replace("bots", "odds");
    url.replace("https", "https:");

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    System.out.println(url);
  }
}
