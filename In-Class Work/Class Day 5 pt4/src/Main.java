import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Main extends JComponent implements MouseMotionListener{
	int imageX, imageY;
	Image image, imageField;
	JFrame frame;
	static int imageWidth=60, imageHeight=60;
	public Main(Image i, Image ifield) {
		image = i;
		imageField = ifield;
		addMouseMotionListener(this);
	}
    public void mouseDragged(MouseEvent e) {
        imageX = e.getX();
        imageY = e.getY();
        repaint();
      }
      public void mouseMoved(MouseEvent e) {}

      public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(imageField, 0, 0, this);
        g2.drawImage(image, imageX, imageY, this);
      }

	public static void main(String[] args) {
		String donuts = "/resources/doughnuts.jpg";
		String donut = "/resources/donut.png";
		
		Image image = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(donut));
		image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
		Image imageField = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(donuts));
		imageField = imageField.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
		JFrame frame = new JFrame("DrageImage");
		frame.add(new Main(image, imageField));
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
