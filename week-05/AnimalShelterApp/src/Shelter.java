import java.util.ArrayList;
import java.util.List;

public class Shelter {
  List<Animal> animalsInShelter;
  List<Animal> adoptedAnimals;

  public Shelter() {
    animalsInShelter = new ArrayList<>();
    adoptedAnimals = new ArrayList<>();
  }

  public void addAnimalsToShelterList(Animal animal) {
    animalsInShelter.add(animal);
  }

//  public void removeAnimals(Animal animal) {
//    animalsInShelter.remove(animal);
//  }

  public String adoptAnimal(People adopter, Animal animal) {
    animal.setAdopted(true);
    animal.setAdopter(adopter.getName());
    animalsInShelter.remove(animal);
    adoptedAnimals.add(animal);
    return String.format("\n%s has adopted %s", adopter.getName(), animal.getType());
  }

  public String logAnimalsInShelterList() {
    String log1 = "\nyou have " + animalsInShelter.size() + " adoptable animals in the shelter \nthese are: \n";
    String log2 = "";
    for (int i = 0; i < animalsInShelter.size() ; i++) {
      log2 += animalsInShelter.get(i).getType() + ", ";
    }
    return log1 + log2;
  }
}
