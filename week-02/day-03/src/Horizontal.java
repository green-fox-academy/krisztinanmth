import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
  public static void mainDraw(Graphics graphics) {

    int x = 100;
    int y = 20;
    drawLineFrom(x, y, graphics);

    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // Draw 3 lines with that function. Use loop for that.
  }

  public static void drawLineFrom(int x, int y, Graphics graphics) {
    //setting color
    graphics.setColor(new Color(67, 154, 168));

    //for loop for creating 3 different lines
    for (int i = 0; i < 3; i++) {
      graphics.drawLine(x, y, x+50, y);
      y += 75;
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