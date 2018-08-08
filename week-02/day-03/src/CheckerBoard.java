import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {

    int row;
    int col;
    int x;
    int y;

    for (row = 0; row < 8; row++) {
      for (col = 0; col < 8; col++) {
        x = col * 40;
        y = row * 40;
        if ((row % 2) == (col % 2)) {
          graphics.setColor(Color.WHITE);
        }
        else {
          graphics.setColor(Color.BLACK);
        }
        graphics.fillRect(x, y, 40, 40);
      }
    }
  }

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