import javax.swing.*;
import java.awt.*;

public class DibujarElipse extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(50, 50, 200, 100); // Dibuja una elipse
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DibujarElipse());
        frame.setVisible(true);
    }
}