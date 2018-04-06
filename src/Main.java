import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        ImageIcon icon = new ImageIcon("assets/google.png");
        ImageIcon logo = new ImageIcon("assets/logo.png");
        Dimension dim = new Dimension(650, 350);

        frame.setTitle("Google");
        frame.setIconImage(icon.getImage());
        frame.setPreferredSize(dim);
        frame.getContentPane().setSize(dim);
        frame.setResizable(true);
        frame.add(ImageIcon(logo));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
