public class Book {
  private String author;
  private String title;
  private int releaseYear;

  public Book(String author, String title, int releaseYear) {
    this.author = author;
    this.title = title;
    this.releaseYear = releaseYear;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  @Override
  public String toString() {
    return String.format("%s : %s (%d)", this.author, this.title, this.releaseYear);
  }
}


