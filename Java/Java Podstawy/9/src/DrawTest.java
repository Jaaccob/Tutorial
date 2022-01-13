import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawTest {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            var frame = new DrawFrame();
            frame.setTitle("DrawTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class DrawFrame extends JFrame {
    public DrawFrame() {
        add(new DrawComponent());
        pack();
    }
}

class DrawComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public void paintComponent(Graphics g) {
        var g2 = (Graphics2D) g;

        //Rysowanie prostokąta
        double leftX = 100;
        double topY = 100;
        double width = 200;
        double height = 150;

        var rec = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rec);

        //Rysowanie elipsy
        var ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rec);
        g2.draw(ellipse);

        //Rysowanie przekatnej
        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

        //Rysowanie koła z takim samym środkiem
        double centerX = rec.getCenterX();
        double centerY = rec.getCenterY();
        double radius = 150;

        var circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
        g2.draw(circle);
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
