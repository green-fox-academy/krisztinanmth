public class AirCraft {
  int ammoMax;
  int baseDamage;
  int ammoLevel;
  String type;
  boolean isPriority;

  public AirCraft(String type, int ammoMax, int baseDamage, boolean isPriority) {
    this.type = type;
    this.ammoMax = ammoMax;
    this.baseDamage = baseDamage;
    this.isPriority = isPriority;
    this.ammoLevel = ammoLevel;
  }
  public int fight() {
    int damage = baseDamage * ammoLevel;
    ammoLevel = 0;
    return damage;
  }
  public int refill(int ammoToFillWith) {
    int ammoNecessary = ammoMax - ammoLevel;

    if (ammoToFillWith == 0 || ammoNecessary == 0) {
      return ammoToFillWith;
    } else if (ammoNecessary <= ammoToFillWith) {
      return ammoToFillWith - ammoNecessary;
    } else {
      ammoLevel = ammoMax;
      return ammoToFillWith - ammoMax;
    }
  }
  public String getType() {
    return type;
  }
  public String getStatus() {
    return "type: " + type + ", ammo: " + ammoLevel + ", base damage: " + baseDamage + ", all damage: " + baseDamage * ammoLevel;
  }
  public boolean isPriority() {
    return isPriority;
  }
}
