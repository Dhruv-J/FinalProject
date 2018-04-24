import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Test extends JFrame {

    JPanel jp = new JPanel();

    public Test() {
        setTitle("Test");                           //set name of the window
        setSize(550, 105);                          //set window size
        setVisible(true);                           //set it so it is visible
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //set it so that the program exits when x button is pressed

        jp.setLayout(new FlowLayout(1, 50, 50));    //setting flow layout
                                                    //1st number for alignment(negative:left, positive:right)
                                                    //2nd number for space between elements
                                                    //3rd numbers for space from the top
        jp.add(new JButton("Button1"));             //adding three numbers
        jp.add(new JButton("Button2"));
        jp.add(new JButton("Button3"));

        add(jp);                                    //add the entire panel
    }

    public static void main(String[] args) {
        Test t = new Test();
    }

    /*
    JLabel jl;                                      //declare JLabel
    JButton jb;                                     //declare JButton
    JPanel jp, jp2;                                 //declare both JPanels

    public Test() {
        setTitle("Test");                           //set name of the window
        setSize(960, 960);                          //set window size
        setVisible(true);                           //set it so it is visible
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //set it so that the program exits when x button is pressed

        jp = new JPanel();                          //initializing JPanels
        jp2 = new JPanel();

        jl = new JLabel("Message");                 //setting message for JLabel as 'message'
        jp.add(jl);                                 //adding the JLabel to the first JPanel
        add(jp);                                    //adding the first JPanel to the window

        jb = new JButton("Press Me");               //setting message for JButton as 'Press Me'
        jp2.add(jb);                                //adding the JButton to the second JPanel
        add(jp2, BorderLayout.SOUTH);               //adding the JPanel but to the bottom of the JFrame
    }


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


    public static void main(String[] args) {
        Test t = new Test();                        //declaring Test object
        //t.paint(null);                              //calling paintRectangle method
    }
    */
}
