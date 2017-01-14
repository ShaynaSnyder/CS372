import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JTextField;
class HelloComponent extends javax.swing.JComponent
implements MouseMotionListener, ActionListener, Runnable {
	boolean blink = false;
	String message;
	int x = 125, y = 95, colorIndex = 0;
	static Color[] someColors = {Color.blue, Color.green, Color.magenta, Color.cyan};
	JButton button;
	JTextField txt;
	
    public HelloComponent() { 
        message = "Hello world";
        init();
    }
    public HelloComponent(String m) { 
        message = m; 
        init();
    }

    private void init() {
    	setLayout(new FlowLayout());
    	txt = new JTextField(20);
    	add(txt);
        button = new JButton("Change color");
        add(button);

        button.addActionListener(this);
        addMouseMotionListener(this);
        
        Thread t = new Thread(this);
        t.start();
    }

    private Color currentColor() { return someColors[colorIndex]; }
    //Override the JComponent.paintComponent so we can do our own rendering
    public void paintComponent(Graphics g) {
    	setForeground(currentColor());
    	g.setColor(blink ? getBackground() : currentColor());
    	g.drawString(message, x, y);
    	}
    //Implement MouseMotionListener
    public void mouseDragged(MouseEvent e) {
    	x = e.getX();
    	y = e.getY();
    	repaint(); //call paintComponent
    }

    //Implement MouseMotionListener
    public void mouseMoved(MouseEvent e) {}

    //Implement ActionListener
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == button) {
    		colorIndex = (colorIndex+1) % someColors.length;
    		if(txt.getText().length()>0) {
    			message = txt.getText();
    			txt.setText("");
    		}
    		repaint();
    	}
    }
    
    //Implement Runnable
    public void run() {
    	try {
    		while(true) {
    			blink = !blink;
    			repaint();
    			Thread.sleep(300);
    		}
    	}
    	catch(InterruptedException e) {}
    }
}

