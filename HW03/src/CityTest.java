//class with data to test the city class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CityTest extends JComponent implements MouseMotionListener{
	//attempt at graphics
	int imageX, imageY;
	Image image, imageField;
	JFrame frame;
	static int imageWidth=60, imageHeight=60;
	public CityTest(Image i, Image ifield) {
		image = i;
		imageField = ifield;
		addMouseMotionListener(this);
	}
    public void mouseDragged(MouseEvent e) {
        imageX = e.getX();
        imageY = e.getY();
        repaint();
      }
      public void mouseMoved(MouseEvent e) {}

      public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(imageField, 0, 0, this);
        g2.drawImage(image, imageX, imageY, this);
      }
      
	public static void main(String[] args) {
		//creates city object
		City city = new City();
		
		//creates police, teacher, and kid objects
		Police[] police = {new Police("Terrence", 29, 1234567, Police.Role.Sargent), new Police("Milly", 31, 8546732, Police.Role.Captain),
				new Police("Barry", 56, 9712322, Police.Role.Chief), new Police("Amy", 21, 3605478, Police.Role.Sargent)};
		Teacher[] teachers = {new Teacher("Sherlock", 41, 4543276, 7, "Bachelor's"), new Teacher("Wynter", 23, 7658779, 2, "Master's")};
		Kid[] kids = {new Kid("Shayna", 7, 6104553, "Kit Kat"), new Kid("Cheree", 15, 7843454, "M&M's"), new Kid("Willy", 9, 8773434, "Twix")};
		
		//adds people to people array list and outputs city occupants
		System.out.printf("City occupants:\n");
		for(int a=0; a<police.length; a++) {
			city.addPeople(police[a]);
			city.addPolice(police[a]); }
		for(int b=0; b<teachers.length; b++) {
			city.addPeople(teachers[b]);
			city.addTeachers(teachers[b]); }
		for(int c=0; c<kids.length; c++) {
			city.addPeople(kids[c]);
			city.addKids(kids[c]);}
		
		//creates city hall and school objects
		CityHall cityHall = new CityHall("City Hall", "534 State Street");
		School school = new School("High School", "1024 Alderwood Lane");
		
		//adds buildings to building array lists
		System.out.printf("\nBuildings in city:\n");
		city.addBuildings(cityHall);
		city.addCityHall(cityHall);
		city.addBuildings(school);
		city.addSchool(school);
		
		//calls functions to add occupants to buildings and output occupants
		city.addOcc();
		city.getOcc();
		
		//attempt at graphics
		String smalltown = "/resources/smalltown.jpg";
		String police1 = "/resources/police1.png";
		
		Image image = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(police1));
		image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
		Image imageField = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(smalltown));
		imageField = imageField.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
		JFrame frame = new JFrame("DragImage");
		frame.add(new CityTest(image, imageField));
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}