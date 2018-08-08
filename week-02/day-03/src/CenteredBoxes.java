import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredBoxes {

  public static void mainDraw(Graphics graphics) {

    for (int i = 0; i < 3; i++) {

      //creating 'size' object for generating random numbers for sizes of boxes
      int size = (int) (Math.random() * 200);
      centerMyBoxesPlease(graphics, size);
    }
  }
  public static void centerMyBoxesPlease(Graphics graphics, int size){

    //setting color and drawing boxes
    graphics.setColor(Color.BLACK);
    graphics.drawRect((WIDTH / 2) - (size/2), (HEIGHT /2) - (size / 2),size,size);
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}