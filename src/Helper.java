
//YOUR CODE DOES NOT GO IN HERE! CLICK ON THE ColorsandShapes.JAVA FILE <- <- <-

import javax.swing.JFrame;
import java.awt.Color;
public class Helper{
public static void main(String[] args) {
    JFrame wn =  new JFrame();//new window
    wn.setSize(800, 600);
    wn.setTitle("Geometric Graphics in Java");
    
    //use this when you want to output graphics on the screen      
    wn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    wn.getContentPane().setBackground(Color.BLACK);
    
    //create an instance of the JavaGeometricGraphics class
    ColorsandShapes component = new ColorsandShapes(); 
    wn.add(component);
    wn.setVisible(true);
}
}
 