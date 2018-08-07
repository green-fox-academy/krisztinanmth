import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel {

  public void paintComponent (Graphics g) {
    super.paintComponent(g);

//    //set background color:
//    this.setBackground(Color.WHITE);

//    //choose color to draw with
//    g.setColor(Color.BLUE);

//    //draw a rectangle with BLUE
//    g.fillRect(25, 25, 100, 30);

//    //we can reset color - and create custom RGB colors
//    g.setColor(new Color(190, 81, 215));

//    //draw a rectangle with custom color
//    g.fillRect(25, 65, 100, 30);

//    //we can also draw text on the screen
//    //first we change color again
//    g.setColor(Color.CYAN);

//    //and the way we can draw text or strings
//    g.drawString("this is some text", 25, 120);

    //stuff from second video from bucky

    //first setting background-color
    this.setBackground(Color.BLACK);

    //setting drawing color
    g.setColor(Color.WHITE);

    //draw Line
    g.drawLine(10, 25, 200, 45);

    //setting color again
    g.setColor(Color.GREEN);

    //now drawing a not filled rectangle - NOTE the fill missing
    g.drawRect(10, 55, 100, 30);

    //now ovals are coming
    //first setting colors
    g.setColor(Color.WHITE);

    //drawing ovals - filled
    g.fillOval(10, 95, 100, 30);

    //setting color to draw a 3D rectangle
    g.setColor(Color.YELLOW);

    //3D rectangle
    g.fill3DRect(10, 160, 100, 50, true);
  }
}
