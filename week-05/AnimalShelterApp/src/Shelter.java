import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shelter {
  List<Animal> animalsInShelter;
  List<People> adopters;
  List<Animal> adoptedAnimals;

  public Shelter() {
    animalsInShelter = new ArrayList<>();
    adopters = new ArrayList<>();
    adoptedAnimals = new ArrayList<>();
  }

  public void addAnimalsToShelterList(Animal animal) {
    animalsInShelter.add(animal);
  }

  public void addPeopleToAdopters(People person) {
    adopters.add(person);
  }

  public void adopt(People person) {
    for (int i = 0; i < animalsInShelter.size() ; i++) {
      animalsInShelter.get(i).setAdopted();
      animalsInShelter.remove(animalsInShelter.get(i));
      adoptedAnimals.add(animalsInShelter.get(i));
    }
  }

  public String logAnimalsInShelterList() {
    String log1 = "you have " + animalsInShelter.size() + " animals in the shelter \nthese are: \n";
    String log2 = "";
    for (int i = 0; i < animalsInShelter.size() ; i++) {
      log2 += animalsInShelter.get(i).getType() + ", ";
    }
    return log1 + log2;
  }
}
