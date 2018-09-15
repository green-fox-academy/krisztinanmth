public class User {

  private int id;

  public User(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void incerementId() {
    id += 100;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      '}';
  }
}