import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class Main extends JComponent{
	JFrame frame;
	private JTextField textField;
	public Main() {
		initialize();
		frame.setVisible(true);
	}
	private void initialize() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.getContentPane().setForeground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		frame.getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnAc = new JButton("AC");
		btnAc.setBackground(new Color(230, 230, 250));
		btnAc.setForeground(new Color(47, 79, 79));
		GridBagConstraints gbc_btnAc = new GridBagConstraints();
		gbc_btnAc.insets = new Insets(0, 0, 5, 0);
		gbc_btnAc.gridx = 3;
		gbc_btnAc.gridy = 3;
		frame.getContentPane().add(btnAc, gbc_btnAc);
		
		JButton button = new JButton("1");
		button.setBackground(new Color(46, 139, 87));
		button.setFont(UIManager.getFont("Button.font"));
		button.setForeground(new Color(230, 230, 250));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 4;
		frame.getContentPane().add(button, gbc_button);
		
		JButton button_15 = new JButton("2");
		button_15.setBackground(new Color(46, 139, 87));
		button_15.setForeground(new Color(230, 230, 250));
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 1;
		gbc_button_15.gridy = 4;
		frame.getContentPane().add(button_15, gbc_button_15);
		
		JButton button_1 = new JButton("3");
		button_1.setForeground(new Color(230, 230, 250));
		button_1.setBackground(new Color(46, 139, 87));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 2;
		gbc_button_1.gridy = 4;
		frame.getContentPane().add(button_1, gbc_button_1);
		
		JButton button_13 = new JButton("/");
		button_13.setBackground(new Color(230, 230, 250));
		button_13.setForeground(new Color(47, 79, 79));
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 0);
		gbc_button_13.gridx = 3;
		gbc_button_13.gridy = 4;
		frame.getContentPane().add(button_13, gbc_button_13);
		
		JButton button_2 = new JButton("4");
		button_2.setForeground(new Color(230, 230, 250));
		button_2.setBackground(new Color(46, 139, 87));
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 5;
		frame.getContentPane().add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setForeground(new Color(230, 230, 250));
		button_3.setBackground(new Color(46, 139, 87));
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 5;
		frame.getContentPane().add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setForeground(new Color(230, 230, 250));
		button_4.setBackground(new Color(46, 139, 87));
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 2;
		gbc_button_4.gridy = 5;
		frame.getContentPane().add(button_4, gbc_button_4);
		
		JButton button_12 = new JButton("*");
		button_12.setBackground(new Color(230, 230, 250));
		button_12.setForeground(new Color(47, 79, 79));
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 0);
		gbc_button_12.gridx = 3;
		gbc_button_12.gridy = 5;
		frame.getContentPane().add(button_12, gbc_button_12);
		
		JButton button_5 = new JButton("7");
		button_5.setForeground(new Color(230, 230, 250));
		button_5.setBackground(new Color(46, 139, 87));
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 0;
		gbc_button_5.gridy = 6;
		frame.getContentPane().add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setForeground(new Color(230, 230, 250));
		button_6.setBackground(new Color(46, 139, 87));
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 1;
		gbc_button_6.gridy = 6;
		frame.getContentPane().add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setForeground(new Color(230, 230, 250));
		button_7.setBackground(new Color(46, 139, 87));
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 2;
		gbc_button_7.gridy = 6;
		frame.getContentPane().add(button_7, gbc_button_7);
		
		JButton button_11 = new JButton("-");
		button_11.setBackground(new Color(230, 230, 250));
		button_11.setForeground(new Color(47, 79, 79));
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 0);
		gbc_button_11.gridx = 3;
		gbc_button_11.gridy = 6;
		frame.getContentPane().add(button_11, gbc_button_11);
		
		JButton button_14 = new JButton("0");
		button_14.setBackground(new Color(46, 139, 87));
		button_14.setForeground(new Color(230, 230, 250));
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 0, 5);
		gbc_button_14.gridx = 0;
		gbc_button_14.gridy = 7;
		frame.getContentPane().add(button_14, gbc_button_14);
		
		JButton button_8 = new JButton(".");
		button_8.setBackground(new Color(230, 230, 250));
		button_8.setForeground(new Color(47, 79, 79));
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 0, 5);
		gbc_button_8.gridx = 1;
		gbc_button_8.gridy = 7;
		frame.getContentPane().add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("=");
		button_9.setBackground(new Color(230, 230, 250));
		button_9.setForeground(new Color(47, 79, 79));
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 0, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 7;
		frame.getContentPane().add(button_9, gbc_button_9);
		
		JButton button_10 = new JButton("+");
		button_10.setBackground(new Color(230, 230, 250));
		button_10.setForeground(new Color(47, 79, 79));
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.gridx = 3;
		gbc_button_10.gridy = 7;
		frame.getContentPane().add(button_10, gbc_button_10);
	}
	private void addgb(Component c, int x, int y) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = x;
		gbc.gridy = y;
		frame.getContentPane().add(c, gbc);
	}
	public static void main(String[] args) {
		Main m = new Main();
	}
}