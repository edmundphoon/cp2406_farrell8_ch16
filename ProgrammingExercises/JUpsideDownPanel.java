import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class JUpsideDownPanel extends JPanel implements ActionListener
{
    String phrase = "I want to be free of this curse.";
    int xPosition = 100;
    int yPosition = 100;
    final int SIZE = 40;
    int i = 0;
    JButton phraseButton = new JButton("Click Me");
    Font rightSideUpFont = new Font("Arial", Font.ITALIC, SIZE);
    Font upSideDownFont = new Font("Arial", Font.ITALIC, -SIZE);
    Font font = rightSideUpFont;
    int yUpSide = yPosition - SIZE / 2;


    public JUpsideDownPanel()
    {
        setBackground(Color.WHITE);
        add(phraseButton);
        phraseButton.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        gr.setFont(font);
        gr.drawString(phrase, xPosition, yPosition);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(i % 2 == 1)
        {
            font = rightSideUpFont;
            xPosition = 100;
            yPosition = 100;
        }
        else
        {
            font = upSideDownFont;
            xPosition = 500;
            yPosition = yUpSide;
        }
        ++i;
        repaint();
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JUpsideDownPanel());
        frame.setSize(600, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
