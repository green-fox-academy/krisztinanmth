public class DogMain {

  public static void main(String[] args) {
    //as breed is static method, the proper way to reach it
    //is through the class, as below, as it belongs to the class being a static method...
    Dog.breed();
    //making a Dog object and accessing it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.setName("bart");
    //making  a Dog array
    Dog[] myDogs = new Dog[3];
    //and putting some dogs in it
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;
    //now accessing dogs using the array references
    myDogs[0].setName("fred");
    myDogs[1].setName("marge");
    //hmmmm.... what is myDogs[2] setName();()?
    System.out.print("last dog's name is: ");
    System.out.println(myDogs[2].getName());
    //now loop through the array and tell all the dogs to bark :)
    int x = 0;
    while (x < myDogs.length) {
      myDogs[x].bark();
      x++;
    }
  }
}
