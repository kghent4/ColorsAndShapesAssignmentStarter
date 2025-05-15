import java.awt.Color;      //Color class
import java.awt.Graphics;   //primitive Graphic class
import java.awt.Graphics2D;   //extends Graphic clas
import java.awt.Rectangle;    //Rectangle class
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D;     //Line Class
import javax.swing.JComponent;

import java.awt.*;  
import javax.swing.JFrame;  

public class JavaGeometricGraphics extends JComponent
{
  public void paintComponent(Graphics g)
  {
    /*
    STEP 1: Create Color objects for all colors that
            you want to use (at least 3) using different constructors.
            An example is provided below.
    */
    
    Color color1 = new Color(250, 212, 246);

    /*
    STEP 2: Draw something using the Graphics class in Java!
            Use the documentation to see how to create
            shapes, change colors, and display text. The
            Graphics object you will use is called g.
            Some commonly used methods are provided below.

            For full credit, include:
            - at least 3 colors
            - at least 5 different Graphics methods
    
    */
    
    g.setColor(color1);
    g.fillOval(10, 10, 100, 100);
    g.drawString("First Color", 30, 130);

  }
}