public class F16 extends AirCraft {

  public F16() {
    setAmmoMax(8);
    setBaseDamage(30);
    setAmmoLevel(0);
    setType("F16");
  }

  public boolean isPriority() {
    return false;
  }
}

