
public class AnimalShelterApp {
  /**
   * create an animal shelter application where
   * - animals can be stored in a list
   * - animals can be adopted by people
   * - one person can adopt many animals, but one can be adopted by only one person
   * - if an animal is adopted, it is no longer listed in the shelter,
   *
   * but belongs to the
   *  adopter person, and the owner of the animal is also stored in the animal object
   */
  public static void main(String[] args) {
    Shelter shelter = new Shelter();
    Animal cheetah = new Animal("cheetah");
    Animal panda = new Animal("panda");
    Animal chinchilla = new Animal("chinchilla");
    Animal koala = new Animal("koala");
    Animal teki = new Animal("turtleTeki");
    shelter.addAnimalsToShelterList(cheetah);
    shelter.addAnimalsToShelterList(panda);
    shelter.addAnimalsToShelterList(chinchilla);
    shelter.addAnimalsToShelterList(koala);
    shelter.addAnimalsToShelterList(teki);
    People lennie = new People("lennie");

    System.out.println(shelter.logAnimalsInShelterList());
    System.out.println(shelter.adoptAnimal(lennie, teki));
    System.out.println(shelter.logAnimalsInShelterList());
    System.out.println(shelter.adoptAnimal(lennie, panda));
    System.out.println(shelter.logAnimalsInShelterList());

  }
}
