public class Animal {
  private String type;
  private boolean isAdopted;

  public Animal(String type) {
    this.type = type;
    isAdopted = false;
  }

  public String getType() {
    return type;
  }

//  public void setType(String type) {
//    this.type = type;
//  }

  public boolean isAdopted() {
    return isAdopted;
  }

  public void setAdopted() {
    boolean isAdopted = true;
  }

  //  public boolean adoptAnimals(Animal animal) {
//    animal.isAdopted = true;
//    return true;
//  }
}