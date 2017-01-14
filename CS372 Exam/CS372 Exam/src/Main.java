import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Main extends JComponent implements MouseListener{
	JFrame frame;
	Image iCircle, iSquare, iRectangle, iTriangle;
	public int y=0;
	private JTextArea text2;
	public static ArrayList<Circle> circles = new ArrayList<Circle>();
	public static ArrayList<Square> squares = new ArrayList<Square>();
	public static ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	public static ArrayList<Triangle> triangles = new ArrayList<Triangle>();
	public static ArrayList<JButton> buttons = new ArrayList<JButton>();

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
                    line = rdr.readLine();}
                    for(int i=0; i<parts.length; i++){
                    if(parts[i].contains("circle")){
                    	String[] circleParts = line.split(" ");
                    	int ID = Integer.parseInt(circleParts[1]);
                    	double radius = Double.parseDouble(circleParts[2]);
                    	String color = circleParts[3];
                    	addCircles(ID, radius, color);}
                    else if(parts[i].contains("square")){
                    	String[] squareParts = line.split(" ");
                    	int ID = Integer.parseInt(squareParts[1]);
                    	int side = Integer.parseInt(squareParts[2]);
                    	String color = squareParts[3];
                    	addSquares(ID, side, color);}
                    else if(parts[i].contains("rectangle")){
                    	String[] rectangleParts = line.split(" ");
                    	int ID = Integer.parseInt(rectangleParts[1]);
                    	int length = Integer.parseInt(rectangleParts[2]);
                    	int width = Integer.parseInt(rectangleParts[3]);
                    	String color = rectangleParts[4];
                    	addRectangles(ID, length, width, color);}
                    else if(parts[i].contains("triangle")){
                    	String[] triangleParts = line.split(" ");
                    	int ID = Integer.parseInt(triangleParts[1]);
                    	int s1 = Integer.parseInt(triangleParts[2]);
                    	int s2 = Integer.parseInt(triangleParts[3]);
                    	int s3 = Integer.parseInt(triangleParts[4]);
                    	String color = triangleParts[5];
                    	addTriangles(ID, s1, s2, s3, color);}}}}
		
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
		
		for(int c=0; c<circles.size(); c++){
			JButton btn = new JButton(circles.get(c).toString());
			buttons.add(btn);}
		
	}
	
	public Main(Image iC, Image iS, Image iR, Image iT){
		iCircle = iC;
		iSquare = iS;
		iRectangle = iR;
		iTriangle = iT;
		addMouseListener(this);
		
	}
	
	public static void addCircles(int ID, double radius, String color){
		Circle c1 = new Circle(ID, radius, color);
		circles.add(c1);
	}
	public static void addSquares(int ID, int side, String color){
		Square s1 = new Square(ID, side, color);
		squares.add(s1);
	}
	public static void addRectangles(int ID, int length, int width, String color){
		Rectangle r1 = new Rectangle(ID, length, width, color);
		rectangles.add(r1);
	}
	public static void addTriangles(int ID, double s1, double s2, double s3, String color){
		Triangle t1 = new Triangle(ID, s1, s2, s3, color);
		triangles.add(t1);
	}
	
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        //g2.drawImage(iCircle, 150, 50, this);
        //g2.drawImage(iSquare,  100,  350,   this);
        //g2.drawImage(iRectangle, 550,  80,  this);
        //g2.drawImage(iTriangle, 550,  350,  this);
		for(int b=0; b<buttons.size(); b++){
			buttons.get(b).setBounds(0, y, 100, 20);
			add(buttons.get(b));
			y+=20;}
        String properties="";
		text2 = new JTextArea();
		text2.setBounds(500, 0, 500, 700);
		add(text2);
        text2.setEditable(false);
		text2.setText(properties);
        if(text2!=null){
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
