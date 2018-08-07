import javax.swing.*;
import java.awt.*;

public class bucky {

  public static void main(String[] args) {

    JFrame f = new JFrame("Title");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Peach p = new Peach();

    //this background color was just added in the second video
    p.setBackground(Color.BLACK);

    f.add(p);
    f.setSize(500, 270);
    f.setVisible(true);
  }
}
