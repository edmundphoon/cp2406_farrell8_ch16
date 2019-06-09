import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class JChangeSizeAndColorPanel extends JPanel implements ActionListener
{
    String phrase = "I want to be free of this curse.";
    int xPosition = 10;
    int size = 40;
    JButton phraseButton = new JButton("Click Me");
    final int MOVE_RIGHT = 100;
    final int MAX_CLICK = 3;
    int i = 0;
    final int CHANGE_SIZE = 8;

    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);


    public JChangeSizeAndColorPanel()
    {
        setBackground(Color.WHITE);
        add(phraseButton);
        phraseButton.addActionListener(this);
    }

    @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        gr.setFont(new Font("Arial", Font.ITALIC, size));
        gr.setColor(randomColor);
        gr.drawString(phrase, 50, 120);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(i == 0)
            randomColor = Color.RED;
        else
        if(i == 1)
            randomColor = Color.GREEN;
        else
        if(i == 2)
            randomColor = Color.BLUE;
        i++;
        size -= CHANGE_SIZE;
        xPosition += MOVE_RIGHT;
        if(i <= MAX_CLICK)
            repaint();
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JChangeSizeAndColorPanel());
        frame.setSize(340, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
