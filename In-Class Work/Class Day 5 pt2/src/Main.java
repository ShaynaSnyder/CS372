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
		
		frame.setLayout(new GridBagLayout());
		addgb(new JButton("one"), 1, 0);
		addgb(new JButton("two"), 0, 1);
		addgb(new JButton("three"), 1, 1);
		addgb(new JButton("four"), 2, 1);
		addgb(new JButton("five"), 1, 2);
	}
	private void addgb(Component c, int x, int y) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = x;
		gbc.gridy = y;
		frame.add(c, gbc);
	}
	public static void main(String[] args) {
		Main m = new Main();
	}
}