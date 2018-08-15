public class PostItPlease {
  public static void main(String[] args) {
    //      Create a few example post-it objects:
    //  an orange with blue text: "Idea 1"
    //  a pink with black text: "Awesome"
    //  a yellow with green text: "Superb!"
    MyPostIts postIt1 = new MyPostIts();
    postIt1.backgroundColor = "orange";
    postIt1.text = "Idea 1";
    postIt1.textColor = "blue";
    MyPostIts postIt2 = new MyPostIts();
    postIt2.backgroundColor = "pink";
    postIt2.text = "Awesome";
    postIt2.textColor = "black";
    MyPostIts postIt3 = new MyPostIts();
    postIt3.backgroundColor = "yellow";
    postIt3.text = "Superb";
    postIt3.textColor = "green";

    postIt1.displayPostIts();
    postIt2.displayPostIts();
    postIt3.displayPostIts();

  }
}
