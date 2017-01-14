import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingBook {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	Icon icon = new ImageIcon("rhino.gif");
	JButton button = new JButton(icon);
	
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			System.out.println("Urp!");}
	});
	frame.getContentPane().add(button);
	frame.pack();
	frame.setSize(300, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	frame.setVisible(true);
	}
}
