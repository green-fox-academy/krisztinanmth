import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics) {
    int size = 150;
    int xStart = WIDTH / 2 - size / 2;
    int yStart = HEIGHT / 2 - size / 2;
    drawMyFractalPlease(xStart, yStart, size, graphics);
  }

  private static void drawMyRectangle(int xStart, int yStart, int size, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.fillRect(xStart, yStart, size, size);
  }

  private static void drawMyFractalPlease(int xStart, int yStart, int size, Graphics graphics) {
    drawMyRectangle(xStart, yStart, size, graphics);
    if(size > 3) {
      drawMyFractalPlease(xStart + size / 3, yStart - size / 3 * 2, size / 3, graphics);
      drawMyFractalPlease(xStart - size / 3 * 2, yStart + size / 3, size / 3, graphics);
      drawMyFractalPlease(xStart + size / 3, yStart + size / 3 * 4, size / 3, graphics);
      drawMyFractalPlease(xStart + size / 3 * 4, yStart + size / 3, size / 3, graphics);
      drawMyFractalPlease(xStart - size / 3 * 2, yStart - size / 3 * 2, size / 3, graphics);
      drawMyFractalPlease(xStart + size / 3 * 4, yStart - size / 3 * 2, size / 3, graphics);
      drawMyFractalPlease(xStart - size / 3 * 2, yStart + size / 3 * 4, size / 3, graphics);
      drawMyFractalPlease(xStart + size / 3 * 4, yStart + size / 3 * 4, size / 3, graphics);
    }
  }



  // Don't touch the code below
  static int WIDTH = 620;
  static int HEIGHT = 643;

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
      this.setBackground(new Color(116, 186, 70));
    }
  }
}
