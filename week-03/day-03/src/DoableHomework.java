import java.util.*;
//    Create 5 trees
//    Store the data of them in variables in your program
//    for every tree the program should store its'
//    type
//    leaf color
//    age
//    sex
//    you can use just variables, or lists and/or maps

public class DoableHomework {
  public static void main(String[] args) {
    //declaring first HashMap
    HashMap<Integer, String> treeTypes = new HashMap<Integer, String>();
    //adding elements to first HashMap
    treeTypes.put(0, "maple");
    treeTypes.put(1, "lemon");
    treeTypes.put(2, "pine");
    treeTypes.put(3, "coconut");
    treeTypes.put(4, "oak");
    //declaring second HashMap for leafColor
    HashMap<Integer, String> leafColor = new HashMap<>();
    //adding keys and values
    leafColor.put(0, "red");
    leafColor.put(1, "yellow");
    leafColor.put(2, "green");
    leafColor.put(3, "military");
    leafColor.put(4, "pastel");
    //Arraylist for age
    List<Integer> ageOfTress = new ArrayList<>();
    ageOfTress.add(100);
    ageOfTress.add(5);
    ageOfTress.add(87);
    ageOfTress.add(34);
    ageOfTress.add(96);
    //Array for sex of trees
    String[] sex = {"female", "male", "male", "female", "female"};

    displayTypes(treeTypes);
    System.out.println();
    displayLeafColors(leafColor);
    System.out.println();
    System.out.println(ageOfTress);
    System.out.println();
    displaySexOFTrees(sex);
    System.out.println();
  }
  //function for displaying treeTypes content, using Iterator
  public static void displayTypes(HashMap treeTypes) {
    Set set = treeTypes.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
      Map.Entry mapEntry = (Map.Entry)iterator.next();
      System.out.println("key is: " + mapEntry.getKey()+ " \t " + "Value is: " + mapEntry.getValue());
    }
  }

  //function for displaying leafColors
  public static void displayLeafColors(HashMap leafColor) {
    Set set2 = leafColor.entrySet();
    Iterator iterator2 = set2.iterator();
    while(iterator2.hasNext()) {
      Map.Entry mapEntry2 = (Map.Entry)iterator2.next();
      System.out.println("key is: " + mapEntry2.getKey()+ " \t " + "Value is: " + mapEntry2.getValue());
    }
  }
  //function for displaying array for sex
  public static void displaySexOFTrees(String[] sex) {
    for (int i = 0; i < sex.length; i++) {
      System.out.print(sex[i] + ", ");
    }
  }
}






















