import java.util.*;

public class Bookshelf {
  private List<Book> books;

  public Bookshelf() {
    books = new ArrayList<>();
  }

  public void add(Book book) {
    books.add(book);
  }

  public void remove(String title) {
    for (int i = 0; i < books.size() ; i++) {
      if (books.get(i).getTitle().equals(title)) {
        books.remove(i);
        break;
      }
    }
  }

  public Map<String, Integer> countAuthors() {
    Map<String, Integer> countedAuthors = new HashMap<>();
    for (int i = 0; i < books.size() ; i++) {
      if (!countedAuthors.containsKey(books.get(i).getAuthor())) {
        countedAuthors.put(books.get(i).getAuthor(), 1);
      }
      else {
        countedAuthors.put(books.get(i).getAuthor(), countedAuthors.get(books.get(i).getAuthor()) + 1);
      }
    }
    return countedAuthors;
  }

  public String favAuthor() {
    Map<String, Integer> countedAuthors = countAuthors();
    int temp = 0;
    String favAuthor = "";
    for (String author : countedAuthors.keySet()) {
      if (countedAuthors.get(author) > temp) {
        temp = countedAuthors.get(author);
        favAuthor = author;
      }
    }
    return "favorite author: " + favAuthor;
  }

  public List<Integer> sortBooksByReleaseYear() {
    List<Integer> sortedBooksByReleaseYear = new ArrayList<>();
    for (int i = 0; i < books.size() ; i++) {
      sortedBooksByReleaseYear.add(books.get(i).getReleaseYear());
    }
    Collections.sort(sortedBooksByReleaseYear);
    return sortedBooksByReleaseYear;
  }

  public String latestPublished() {
    List<Integer> sortedByYears = sortBooksByReleaseYear();
    String temp = "";
    for (int i = 0; i < books.size() ; i++) {
      if (books.get(i).getReleaseYear() == sortedByYears.get(sortedByYears.size() - 1)) {
        temp = "latest released: " + books.get(i).toString();
      }
    }
    return temp;
  }

  public String earliestPublished() {
    List<Integer> sortedByYears = sortBooksByReleaseYear();
    String temp = "";
    for (int i = 0; i < books.size() ; i++) {
      if (books.get(i).getReleaseYear() == sortedByYears.get(0)) {
        temp = "earliest released: " + books.get(i).toString();
      }
    }
    return temp;
  }

  @Override
  public String toString() {
    if (books.size() == 0) {
      return "you have no books here";
    }
    else {
      return "you have " + books.size() + " books" + "\n" + earliestPublished() + "\n" + latestPublished() + "\n" + favAuthor();
    }
  }
}
