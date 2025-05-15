import javax.swing.*;
import java.awt.*;

public class ColorsandShapes {

    public static void main(String[] args) {

        //2.2 Constructors
        //Create your Color objects here!
        //1. 
        //2. 
        //3.
        //4.

        JFrame frame = new JFrame("Color Circles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 250);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;

                //2.3 Methods
                //Use the Graphics2D methods to create a custom graphic!
                //
                //
                //
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
