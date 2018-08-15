public class MyTreeObjects {

    String type; //if i put private before Spring that i can't access the variable from main,just through methods
    String leafColor;
    Integer age; //and than i can just reach them while i am in this MyTreeObjects class
    String sex;


  public void introduction() {
    System.out.print(type + ", \t ");
    System.out.print(leafColor + ", \t ");
    System.out.print(age + ", \t ");
    System.out.print(sex + ", \t ");
    System.out.println();
  }
}
