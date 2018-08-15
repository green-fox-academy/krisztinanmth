public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }
  public BlogPost(String authorName) {
    this.authorName = authorName;
    this.text = "no";
  }
}
