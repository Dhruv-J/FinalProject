import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Test extends JFrame {

    JLabel jl;
    JButton jb;
    JPanel jp, jp2;

    public Test() {
        setTitle("Test");                           //set name of the window
        setSize(960, 960);                          //set window size
        setVisible(true);                           //set it so it is visible
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //set it so that the program exits when x button is pressed

        jp = new JPanel();
        jp2 = new JPanel();

        jl = new JLabel("Message");
        jp.add(jl);
        add(jp);

        jb = new JButton("Press Me");
        jp2.add(jb);
        add(jp2, BorderLayout.SOUTH);
    }

    /*
    public void paint(Graphics g) {
        g.setColor(Color.RED);                      //set color to red
        g.drawRect(480, 480, 200, 100);             //draw a rectangle at 480, 480 with size 200 x 100
        g.setColor(Color.BLUE);                     //set color to blue
        g.fillRect(240, 240, 200, 100);             //draw and fill a rectangle at 240, 240 with size 200 x 100
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);                    //set color to green
        g.drawOval(480, 480, 200, 200);             //draw a circle at 480, 480 with radius 100
        g.setColor(Color.YELLOW);                   //set color to yellow
        g.fillOval(240, 240, 200, 200);             //fill a circle at 240, 240 with radius 100
    }
    */

    public static void main(String[] args) {
        Test t = new Test();                        //declaring Test object
        //t.paint(null);                              //calling paintRectangle method
    }
}
