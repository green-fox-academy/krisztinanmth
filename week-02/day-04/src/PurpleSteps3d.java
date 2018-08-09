import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    int x = 3;
    int y = 3;
    //declaring coordinates for starting point
    createPurpleSteps3d(x, graphics);
  }

  //creating function for drawing myBoxes
  public static void createPurpleSteps3d(int x, Graphics graphics) {

    for (int i = 0; i < 6; i++) {
      x *= 2;

      //setting color
      graphics.setColor(new Color(177, 69, 243));

      //drawing rectangles
      graphics.fillRect(x, x, x, x);
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
