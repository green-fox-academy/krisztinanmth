import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SPositioning {

  public static void mainDraw(Graphics graphics){

    int x = 50;
    int y = 100;

    squarePositioning(x, y, graphics);
  }

  public static void squarePositioning(int x, int y, Graphics graphics) {

    for (int i = 0; i < 3; i++) {
      //setting color
      graphics.setColor(new Color(24, 106, 118));
      //drawing rectangles
      graphics.fillRect(x + i, y + i, 50, 50);
      x += 50;
      y += 50;
    }
  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
