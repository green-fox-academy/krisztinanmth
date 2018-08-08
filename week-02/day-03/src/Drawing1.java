import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing1 {
  public static void mainDraw(Graphics graphics){

    //setting color for horizontal line
    graphics.setColor(Color.RED);

    //drawing horizontal line in the middle of canvas
    graphics.drawLine(0, HEIGHT/2, 320, HEIGHT/2);

    //setting color for vertical line
    graphics.setColor(new Color(9, 156, 48));

    // drawing vertical line in the middle of canvas
    graphics.drawLine(WIDTH/2, 0, WIDTH/2, 343);
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