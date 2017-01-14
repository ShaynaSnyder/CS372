import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	JFrame frame;
	public Main() {
		initialize();
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setLayout(new FlowLayout());
		//frame.setLayout(new GridLayout(3, 2));
		/*frame.add(new JButton("one"));
		frame.add(new JButton("two"));
		frame.add(new JButton("three"));
		frame.add(new JButton("four"));
		frame.add(new JButton("five"));*/
		
		/*frame.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.add(new JButton("one"));
		frame.add(p, BorderLayout.NORTH);
		p = new JPanel();
		p.add(new JButton("two"));
		frame.add(p, BorderLayout.SOUTH);
		p = new JPanel();
		p.add(new JButton("three"));
		frame.add(p, BorderLayout.EAST);
		p = new JPanel();
		p.add(new JButton("four"));
		frame.add(p, BorderLayout.WEST);
		p = new JPanel();
		p.add(new JButton("five"));
		frame.add(p, BorderLayout.CENTER);*/
		
		Box box = Box.createHorizontalBox();
		box.add(Box.createGlue());
		box.add(new JButton("one"));
		box.add(Box.createGlue());
		box.add(new JButton("two"));
		box.add(Box.createHorizontalStrut(10));
		box.add(new JButton("three"));
		box.add(Box.createHorizontalStrut(20));
		box.add(new JButton("four"));
		box.add(Box.createGlue());
		box.add(new JButton("five"));
		frame.add(box);

	}
	public static void main(String[] args) {
		Main m = new Main();
	}
}
