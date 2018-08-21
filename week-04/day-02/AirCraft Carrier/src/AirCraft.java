public class AirCraft {
  private int ammoMax;
  private int baseDamage;
  private int ammoLevel;
  private String type;
  private int damage;

  public int fight() {
      for (int i = ammoMax; i > 0 ; i--) {
        ammoLevel--;
        damage = baseDamage * ammoLevel;
      }
      return damage;
  }

  public int refill(int refill) {
    for (int i = ammoLevel; i < ammoLevel ; i++) {
      ammoLevel++;
    } return refill - ammoLevel;
  }

  public String getStatus() {
    return ("Type" + type + ", Ammo: " + ammoLevel + ", Base Damage: " + baseDamage + ", All Damage: " + damage);
  }

  public int getAmmoMax() {
    return ammoMax;
  }

  public void setAmmoMax(int ammoMax) {
    this.ammoMax = ammoMax;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getAmmoLevel() {
    return ammoLevel;
  }

  public void setAmmoLevel(int ammoLevel) {
    this.ammoLevel = ammoLevel;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return "type";
  }
}
