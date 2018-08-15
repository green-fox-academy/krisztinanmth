public class MyTrees {
  public static void main(String[] args) {

    MyTreeObjects maple;
    maple = new MyTreeObjects();
    maple.type = "maple";
    maple.leafColor = "red";
    maple.age = 100;
    maple.sex = "female";
    maple.introduction();

    MyTreeObjects lemon;
    lemon = new MyTreeObjects();
    lemon.type = "lemon";
    lemon.leafColor = "yellow";
    lemon.age = 5;
    lemon.sex = "male";
    lemon.introduction();
  }
}
