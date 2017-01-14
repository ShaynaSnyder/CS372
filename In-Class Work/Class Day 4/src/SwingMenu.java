import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingMenu {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Animal Species");
		JMenu mammals = new JMenu("Mammals");
		mammals.setMnemonic(KeyEvent.VK_U);
		mammals.add(new JMenuItem("Bear"));
		mammals.add(new JMenuItem("Gorilla"));
		mammals.add(new JMenuItem("Tiger"));
		JMenu oceanDwellers = new JMenu("Ocean Dwellers");
		oceanDwellers.add(new JMenuItem("Blue Whale"));
		oceanDwellers.add(new JMenuItem("Dolphin"));
		oceanDwellers.add(new JMenuItem("Orca"));
		mammals.add(oceanDwellers);
		//mammals.addSeperator();
		
		JMenuItem quitItem = new JMenuItem("Quit");
		quitItem.setMnemonic(KeyEvent.VK_Q);
		quitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK));
		quitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {System.exit(0);}
		});
		mammals.add(quitItem);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(mammals);
		//menuBar.add(reptiles);
		frame.setJMenuBar(menuBar);;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,  300);;
		frame.setVisible(true);
	}
}
