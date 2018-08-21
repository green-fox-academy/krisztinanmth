public class F35 extends AirCraft {

  public F35() {
    setAmmoMax(12);
    setBaseDamage(50);
    setAmmoLevel(0);
    setType("F35");
  }

  public boolean isPriority() {
    return  true;
  }
}
