public class Animal {
  private String type;
  private boolean isAdopted;
  private String adopter;

  public Animal(String type) {
    this.type = type;
    isAdopted = false;
  }

//  public String getAdopter() {
//    return adopter;
//  }

//  public boolean GetIsAdopted() {
//    return isAdopted;
//  }

  public void setAdopted(boolean isAdopted) {
    this.isAdopted = isAdopted;
  }

  public void setAdopter(String adopter) {
    this.adopter = adopter;
  }

  public String getType() {
    return this.type;
  }
}
