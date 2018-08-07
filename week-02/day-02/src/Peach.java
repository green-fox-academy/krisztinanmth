import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel {

  public void paintComponent (Graphics g) {
    super.paintComponent(g);

    //set background color:
    this.setBackground(Color.WHITE);

    //choose color to draw with
    g.setColor(Color.BLUE);

    //draw a rectangle with BLUE
    g.fillRect(25, 25, 100, 30);

    //we can reset color - and create custom RGB colors
    g.setColor(new Color(190, 81, 215));

    //draw a rectangle with custom color
    g.fillRect(25, 65, 100, 30);

    //we can also draw text on the screen
    //first we change color again
    g.setColor(Color.CYAN);

    //and the way we can draw text or strings
    g.drawString("this is some text", 25, 120);
  }
}
