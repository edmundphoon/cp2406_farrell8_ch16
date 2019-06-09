import javax.swing.*;
import java.awt.*;

public class JNestedBoxesPanel extends JPanel
{
    int i = 0;
    final int NUMBOXES = 8;
    final int INC = 20;
    int x;
    int y;
    int width;
    int height;

    @Override
    public void paintComponent(Graphics gr)
    {
        super.paintComponent(gr);
        width = 300;
        height = 300;
        x = 20;
        y = 20;
        for(i = 0; i < NUMBOXES; ++i)
        {
            gr.drawRect(x, y, width, height);
            x += INC;
            y += INC;
            width -= INC * 2;
            height -= INC * 2;
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxesPanel());
        frame.setSize(340, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
