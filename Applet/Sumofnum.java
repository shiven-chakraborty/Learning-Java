import java.awt.*;
import javax.swing.*;

public class Sumofnum extends JFrame
{
    public Sumofnum()
    {

        //initialization of the window
        setTitle("Sum of Numbers");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);    

        int num1 = 25;
        int num2 = 30;

        JPanel panel = new JPanel()
        {
            @Override 
            protected void paintComponent (Graphics g)
            {
                super.paintComponent(g);
                g.setFont(new Font("Arial", Font.PLAIN, 30));
                g.drawString("Sum of numbers: " + (num1 + num2), 70, 90);
            }
        };

        add(panel);
        setVisible(true);
    }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {new Sumofnum();});
        }
}