import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Main extends JComponent implements MouseListener{
	JFrame frame;
	Image iCircle, iSquare, iRectangle, iTriangle;
	private JTextArea text;
	private JTextArea text2;
	public static ArrayList<Circle> circles = new ArrayList<Circle>();
	public static ArrayList<Square> squares = new ArrayList<Square>();
	public static ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	public static ArrayList<Triangle> triangles = new ArrayList<Triangle>();

	public static void main(String[] args) {
		File file = new File("C:/Users/ssnyder19/Documents/shapes.txt");
		try(FileInputStream is = new FileInputStream(file)){
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader rdr = new BufferedReader(ir);
			String line = rdr.readLine();
			while(line!=null){
				String[] parts = line.split("\n");
                for (String p: parts) {
                    if (p.length() > 0 && p.charAt(0) == '"')
                        System.out.printf("%s\t", p.substring(1, p.length()-1));
                    else
                        System.out.printf("%s\t", p);

                    if(p.contains("circle")){
                    	String[] circleParts = line.split(" ");
                    	int ID = Integer.parseInt(circleParts[1]);
                    	double radius = Double.parseDouble(circleParts[2]);
                    	String color = circleParts[3];
                    	addCircles(ID, radius, color);
                    }
                line = rdr.readLine();}}}
        catch (Exception ex) { System.out.printf("Failed for %s\n", "shapes.txt");}
	
		String cPic = "/resources/circle.png";
		Image circle = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(cPic));
		circle = circle.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
		
		String sPic = "/resources/square.png";
		Image square = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(sPic));
		square = square.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		
		String rPic = "/resources/rectangle.jpg";
		Image rectangle = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(rPic));
		rectangle = rectangle.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
		
		String tPic = "/resources/triangle.png";
		Image triangle = Toolkit.getDefaultToolkit().getImage(Main.class.getResource(tPic));
		triangle = triangle.getScaledInstance(300, 250, Image.SCALE_SMOOTH);
		
		JFrame frame = new JFrame("Shapes");
		frame.getContentPane().add(new Main(circle, square, rectangle, triangle));
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public Main(Image iC, Image iS, Image iR, Image iT){
		iCircle = iC;
		iSquare = iS;
		iRectangle = iR;
		iTriangle = iT;
		addMouseListener(this);
		
		String objectList="", properties="";
		text = new JTextArea();
		text2 = new JTextArea();
		text.setBounds(380, 550, 100, 100);
		text2.setBounds(480, 550, 100, 100);
		add(text);
		add(text2);
		text.setEditable(false);
		text2.setEditable(false);
		for(int c=0; c<circles.size(); c++){
			objectList = objectList+circles.get(0).toString()+"\n";
		}
		text.setText(objectList);
		text2.setText(properties);

	}
	
	public static void addCircles(int ID, double radius, String color){
		Circle c1 = new Circle(ID, radius, color);
		circles.add(c1);
	}
	
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        //g2.drawImage(iCircle, 150, 50, this);
        //g2.drawImage(iSquare,  100,  350,   this);
        //g2.drawImage(iRectangle, 550,  80,  this);
        //g2.drawImage(iTriangle, 550,  350,  this);
        if(text!=null){
        text.repaint();
        text2.repaint();}}
	
	public void mouseClicked(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
}
