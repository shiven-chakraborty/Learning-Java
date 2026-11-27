
import java.awt.*;
import javax.swing.*;

public class AppletTest extends JFrame 
{

    public AppletTest() 
    {
        setTitle("Applet Test");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() 
        {
            @Override
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                g.setFont(new Font("Arial", Font.PLAIN, 20));
                g.drawString("Welcome to Java Applet.", 70, 90);
            }
        };

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> {
            new AppletTest();
        });
    }
}
