import java.awt.Graphics;
import java.util.*;
import javax.swing.JFrame;

public class Test extends JFrame {

    public Test() {
        setTitle("Test");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics g) {
        g.drawRect(480, 480, 200, 100);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.paint(null);
    }
}
