import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    //declaring starting coordinates
    int x = 5;
    int y = 5;

    createPurpleSteps(x, y, graphics);
  }

  public static void createPurpleSteps(int x, int y, Graphics graphics) {
    for (int i = 0; i < 19; i++) {
      x += 11;
      y += 11;

      //setting color
      graphics.setColor(new Color(177, 69, 243));

      //drawing rectangles
      graphics.fillRect(x + i, y + i, 12, 12);
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