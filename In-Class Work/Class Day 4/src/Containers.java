import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Containers extends JFrame implements ActionListener{
	JPanel buttons = new JPanel(), labels = new JPanel();
	JButton bAdd = new JButton("add"), bRemove = new JButton("remove");
	static int labelID = 1;
	public Containers(){
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		buttons.setLayout(new FlowLayout());
		labels.setLayout(new FlowLayout());
		add(labels);
		add(buttons);
		buttons.add(bAdd);
		buttons.add(bRemove);
		bRemove.setEnabled(false);
		
		bAdd.addActionListener(this);
		bRemove.addActionListener(this);
		
		this.setVisible(true);
	}
}

public void actionPerformed(ActionEvent e){
	if(e.getSource() == bAdd){
		String lbl = String.format("this is test #%d",  labelID++);
		}
		else if(e.getSource() == bRemove){
			labels.remove(0);
		}
	bRemove.setEnabled(labels.getComponentCount()>0);
	revalidate();
	repaint();
	}
