import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel extends JPanel
{
   String phrase = "I want to be free of this curse.";
   final int START = 6;
   final int END = 20;
   int verticalPosition;
   int i;

   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      verticalPosition = 10;
      for(i = START; i <= END; ++i)
      {
         gr.setFont(new Font("Arial", Font.ITALIC, i));
         gr.drawString(phrase, 50, verticalPosition);
         verticalPosition += 20;
      }
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new JFontSizesPanel());
      frame.setSize(340, 340);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}