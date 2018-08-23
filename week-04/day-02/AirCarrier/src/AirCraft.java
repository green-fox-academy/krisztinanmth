public class AirCraft {
  int ammoMax;
  int baseDamage;
  int ammoLevel;
  String type;
  int damage;

  public int fight() {
    for (int i = ammoMax; i > 0 ; i--) {
      ammoLevel--;
      damage = baseDamage * ammoLevel;
    }
    return damage;
  }

  public int refill(int refill) {
    for (int i = ammoLevel; i < ammoMax ; i++) {
      ammoLevel++;
    } return refill - ammoLevel;
  }

//  public String getStatus() {
//    for(AirCraft airCraft : carrier)
//    return ("Type " + type + ", Ammo: " + ammoLevel + ", Base Damage: " + baseDamage + ", All Damage: " + damage);
//  }


  public void setAmmoMax(int ammoMax) {
    this.ammoMax = ammoMax;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public void setAmmoLevel(int ammoLevel) {
    this.ammoLevel = ammoLevel;
  }

  public void setType(String type) {
    this.type = type;
  }
}
