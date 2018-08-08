import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {

    //setting color for filled 'box'/rectangle
    graphics.setColor(new Color(230, 242, 62));

    //drawing filled rectangle
    graphics.fillRect(50, 60, 200, 60);

    //setting color for lines
    graphics.setColor(Color.BLACK);

    //drawing outline rectangle
    graphics.drawRect(50, 60, 200, 60);

    //setting color for bottom edge
    graphics.setColor(Color.BLUE);

    //drawing bottom line
    graphics.drawLine(50, 120, 250, 120);

    //setting color for left edge
    graphics.setColor(Color.RED);

    //drawing left edge
    graphics.drawLine(50, 60, 50, 120);

    //color for right edge
    graphics.setColor(Color.GREEN);

    //drawing right edge
    graphics.drawLine(250, 60, 250, 120);
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
