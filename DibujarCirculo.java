import javax.swing.*;
import java.awt.*;

public class DibujarCirculo extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(50, 50, 100, 100); // Dibuja un círculo de radio 50 en el punto (50, 50)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DibujarCirculo());
        frame.setVisible(true);
    }
}