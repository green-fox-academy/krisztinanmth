import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    int distance = 15;
    int divider = 2;
    pleaseDrawMyEnvelope(distance,  divider, graphics);
  }

  private static void pleaseDrawMyEnvelope(int distance, int divider, Graphics graphics) {
    for (int i = 1; i < WIDTH / distance / divider ; i++) {
      pleasedrawMyLines(i, distance,  divider, graphics);
    }
  }

  private static void pleasedrawMyLines(int i, int distance, int divider, Graphics graphics) {

    graphics.setColor(new Color(15, 135, 79));
    graphics.drawLine(WIDTH / divider,i * distance, WIDTH / divider - (i * distance), WIDTH / divider);

    graphics.drawLine(WIDTH / divider, i * distance, WIDTH / divider + (i * distance), WIDTH / divider);

    graphics.drawLine(i * distance,WIDTH / divider, WIDTH / divider, WIDTH / divider + (i * distance));

    graphics.drawLine(WIDTH / divider + i * distance, WIDTH / divider, WIDTH / divider,WIDTH - (i * distance));
  }

  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Ex03EnvelopeStar");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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
