import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;
import java.net.URL;

import javax.swing.*;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;


public class Yahtzee extends JComponent{

	
	static JFrame frame = new JFrame("Yahtzee");
	private ArrayList<Image> images = new ArrayList<Image>();
	
	public static void main(String[] args){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		try{
		URL dice1 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Dice-1.svg/557px-Dice-1.svg.png");
		Image i1 = toolkit.getImage(dice1);
		i1 = i1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		
		URL dice2 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Dice-2a.svg/1024px-Dice-2a.svg.png");
		Image i2 = toolkit.getImage(dice2);
		i2 = i2.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		
		URL dice3 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/2/28/Dice-3a.svg/2000px-Dice-3a.svg.png");
		Image i3 = toolkit.getImage(dice3);
		i3 = i3.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		
		URL dice4 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/1/16/Dice-4.svg/557px-Dice-4.svg.png");
		Image i4 = toolkit.getImage(dice4);
		i4 = i4.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		
		URL dice5 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Dice-5.svg/557px-Dice-5.svg.png");
		Image i5 = toolkit.getImage(dice5);
		i5 = i5.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		
		URL dice6 = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Dice-6a.svg/557px-Dice-6a.svg.png");
		Image i6 = toolkit.getImage(dice6);
		i6 = i6.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		
		frame.getContentPane().add(new Yahtzee(i1, i2, i3, i4, i5, i6));}
		catch(Exception ex){;}}
	
	public Yahtzee(Image i1, Image i2, Image i3, Image i4, Image i5, Image i6){
		images.add(i1);
		images.add(i2);
		images.add(i3);
		images.add(i4);
		images.add(i5);
		images.add(i6);
		int total = 0;
		
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,5));
		
        Roll[] roll = new Roll[5];
        for (int i=0; i<5; i++) {
            JLabel l = new JLabel();
            JLabel j = new JLabel();
            j.setText(String.format("                    Dice #%d", i+1));
            roll[i] = new Roll(l, images);
           frame.getContentPane().add(j);
           frame.getContentPane().add(l);}
        
		frame.setVisible(true);
        Thread[] ts = new Thread[5];

		JButton button = new JButton("Roll Dice");
		frame.getContentPane().add(button, BorderLayout.NORTH);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
		        for (int a=0; a<5; a++) {
		            ts[a] = new Thread(roll[a]);
		            ts[a].start();
		            try {
		                Thread.sleep(100);}
		            catch (InterruptedException ex) {;}}}});

        for(int b=0; b<5; b++){
        	try{
        		ts[b].join();}
        	catch(InterruptedException ex){;}}
        JLabel t = new JLabel();
        t.setText(String.format("Total: %d", total));
        frame.getContentPane().add(t);}}


class Roll implements Runnable{
	private JLabel l;
	int finaln;
	ArrayList<Image> images = new ArrayList<Image>();
	Random rand = new Random();
	public Roll(JLabel label, ArrayList<Image> imgs){
		l = label;
		images = imgs;}
	
	public void run(){
		for(int x=0; x<5; x++){
			int temp = rand.nextInt(6);
			ImageIcon icon = new ImageIcon(images.get(temp));
			l.setIcon(icon);
			if(x==4)
				finaln=(1+temp);
			try{Thread.sleep(1000);}
			catch (InterruptedException ex){;}}}
	public int getFinal(){
		return finaln;}}
