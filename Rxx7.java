import javax.swing.*;
import java.awt.*;

public class Rxx7 extends JComponent {
    public void paintComponent(Graphics g){
        Rectangle a=new Rectangle(100,100,100,100);
        Rectangle a1=new Rectangle(250,100,100,100);
        Graphics2D g2=(Graphics2D) g;
        g2.setColor(Color.pink);
        g2.fill(a);
        g2.draw(a);
        Graphics2D g3=(Graphics2D)g;
        g3.setColor(Color.magenta.darker());
        g3.fill(a1);
        g3.draw(a1);


    }

}
