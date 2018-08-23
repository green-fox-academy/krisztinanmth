import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Carrier {
  List<AirCraft> carrier;
  int ammoLevel;
  int ammoStorage;
  int healthPoints;
  int ammoNeeded;
  String type;
  int baseDamage;
  int damage;
  int ammoUsed;

  public Carrier(int ammoStorage, int healthPoints) {
    carrier = new ArrayList<>();
    this.healthPoints = healthPoints;
    this.ammoLevel = ammoLevel;
    this.type = type;
    this.ammoUsed = 8 + 12;
  }


  public void addAirCraft(AirCraft airCraft) {
    carrier.add(airCraft);
  }

  public int ammoNecessary(int ammoMax) {
    ammoNeeded = (ammoMax - ammoLevel) * carrier.size();
    return ammoNeeded;
  }

  public void getStatus() {
    for(AirCraft airCraft : carrier)
      System.out.println(("Type " + type + ", Ammo: " + ammoLevel + ", Base Damage: " + baseDamage + ", All Damage: " + damage));
  }

  public int allAmmo(int ammoLevel) {
    int allAmmo;
    allAmmo = ammoLevel * carrier.size();
    return allAmmo;
  }

  public boolean isPriority() {
    if(type == "F35" ) {
      return true;
    } else {
      return false;
    }
  }

  public void fill() {
    if(ammoStorage == 0) {
      throw new EmptyStackException();
    } else {
      for (AirCraft airCraft : carrier) {
        if (ammoStorage < ammoNeeded && isPriority()) {
          ammoUsed = airCraft.refill(ammoUsed);
        }
      }
    } for (AirCraft airCraft : carrier) {
      if(!isPriority()) {
        ammoUsed = airCraft.refill(ammoUsed);
      }
    }
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public int carrierTotalDamage() {
    int totalDamage = 0;
    for (AirCraft airCraft : carrier) {
      totalDamage += airCraft.fight();
    }
    return totalDamage;
  }

  public void levelOfDamage(int damage) {
    healthPoints -= damage;
  }

  public String carrierFight(Carrier carrier) {
    carrier.levelOfDamage(this.carrierTotalDamage());
    if(carrier.getHealthPoints() <= 0) {
      return "It's dead Jim :(";
    } else {
      return "Still has " + carrier.getHealthPoints() + "HPs";
    }
  }
}
