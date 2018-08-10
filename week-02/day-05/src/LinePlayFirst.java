import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayFirst {
  public static void mainDraw(Graphics graphics) {
    int distance = 15;
      pleaseDrawMyLines(distance, graphics );
  }
  //creating function for drawing lines
  public static void pleaseDrawMyLines (int distance, Graphics graphics){
    for (int i = 0; i < WIDTH/distance; i++) {
      //setting color line to black
      graphics.setColor(new Color(20, 111, 48 ));
      //drawing lines
      graphics.drawLine(i * distance, 0, WIDTH, i * distance);
      graphics.drawLine(0, i * distance, i * distance, WIDTH);
    }
  }
  static int WIDTH = 400;
  static int HEIGHT = 400;

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
