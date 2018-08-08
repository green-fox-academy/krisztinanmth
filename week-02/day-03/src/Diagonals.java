import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
  public static void mainDraw(Graphics graphics) {

    //setting color for diagonal from upper-left corner = diagonal.1
    graphics.setColor(new Color(56, 127, 8));

    //drawing diagonal.1
    graphics.drawLine(0,0, 343, 343);

    //setting color for diagonal.2
    graphics.setColor(new Color(176, 9, 31));

    //drawing diagonal.2
    graphics.drawLine(320, 0, 0, 320);
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