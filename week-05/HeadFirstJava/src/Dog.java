public class Dog {
  String name;

  public static void main(String[] args) {
    //making a Dog object and accessing it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "bart";
    //making  a Dog array
    Dog[] myDogs = new Dog[3];
    //and putting some dogs in it
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;
    //now accessing dogs using the array references
    myDogs[0].name = "fred";
    myDogs[1].name = "marge";
    //hmmmm.... what is myDogs[2] name?
    System.out.print("last dog's name is: ");
    System.out.println(myDogs[2].name);
    //now loop through the array and tell all the dogs to bark :)
    int x = 0;
    while (x < myDogs.length) {
      myDogs[x].bark();
      x++;
    }
  }

  public void bark() {
    System.out.println(name + " says RUFF!");
  }
//  public void eat() {
//
//  }
//  public void chaseCat() {
//
//  }
}
