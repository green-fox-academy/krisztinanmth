import java.util.Arrays;

public class DiceSet {
  // You have a `DiceSet` class which has a list for 6 dices
  // You can roll all of them with roll()
  // Check the current rolled numbers with getCurrent()
  // You can reRoll with reRoll()
  // Your task is to roll the dices until all of the dices are 6
  int[] dices = new int[6];

  public int[] roll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
    return dices;
  }

  public int[] getCurrent() {
    return dices;
  }

  public int getCurrent(int i) {
    return dices[i];
  }

  public void reRoll() {
    for (int i = 0; i < dices.length; i++) {
      dices[i] = (int) (Math.random() * 6) + 1;
    }
  }

  public void reRoll(int k) {
    dices[k] = (int) (Math.random() * 6) + 1;
  }

  public static void main(String[] args) {
    DiceSet diceSet = new DiceSet();
    diceSet.getCurrent();
    diceSet.roll();
    diceSet.getCurrent();
    diceSet.getCurrent(5);
    diceSet.reRoll();
    diceSet.getCurrent();
    diceSet.reRoll(4);
    diceSet.getCurrent();
    for (int i = 0; i < 6 ; i++) {
      while (diceSet.getCurrent(i) != 6) {
        diceSet.reRoll(i);
      }
      System.out.println(diceSet.getCurrent(i));
    }
  }
}
