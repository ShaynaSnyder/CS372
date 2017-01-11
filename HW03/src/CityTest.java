//class with data to test the city class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CityTest extends JComponent implements MouseMotionListener, MouseListener{
	
	int imageX, imageY, clickX, clickY, pX=500, pY=0, tX=70, tY=0, kX=300, kY=0, drag=0;
	Image image1, image2, image3, image4, image5, image6;
	JFrame frame;
	private JTextField textField;
	
	//creates police, teacher, and kid objects
	public static Police[] police = {new Police("Terrence", 29, 1234567, Police.Role.Sargent), new Police("Milly", 31, 8546732, Police.Role.Captain),
			new Police("Barry", 56, 9712322, Police.Role.Chief), new Police("Amy", 21, 3605478, Police.Role.Sargent)};
	public static Teacher[] teachers = {new Teacher("Sherlock", 41, 4543276, 7, "Bachelor's"), new Teacher("Wynter", 23, 7658779, 2, "Master's")};
	public static Kid[] kids = {new Kid("Shayna", 7, 6104553, "Kit Kat"), new Kid("Cheree", 15, 7843454, "M&M's"), new Kid("Willy", 9, 8773434, "Twix")};
	
	public static void main(String[] args) {
		//creates city object
		City city = new City();
		
		//adds people to people array list and outputs city occupants
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
		city.addBuildings(cityHall);
		city.addCityHall(cityHall);
		city.addBuildings(school);
		city.addSchool(school);
		
		//calls functions to add occupants to buildings and output occupants
		city.addOcc();
		
		//attempt at graphics
		String townPic = "/resources/landscape.png";
		Image town = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(townPic));
		town = town.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
		
		String schoolPic = "/resources/school.png";
		Image school1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(schoolPic));
		school1 = school1.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
		
		String cityHallPic = "/resources/cityhall.png";
		Image ch1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(cityHallPic));
		ch1 = ch1.getScaledInstance(470, 420, Image.SCALE_SMOOTH);
		
		String police1Pic = "/resources/police1.png";
		Image police1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(police1Pic));
		police1 = police1.getScaledInstance(110, 150, Image.SCALE_SMOOTH);
		
		String teacher1Pic = "/resources/teacher1.png";
		Image teacher1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(teacher1Pic));
		teacher1 = teacher1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		
		String kid1Pic = "/resources/kid1.png";
		Image kid1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(kid1Pic));
		kid1 = kid1.getScaledInstance(100, 120, Image.SCALE_SMOOTH);
		
		JFrame frame = new JFrame("DragImage");
		frame.getContentPane().add(new CityTest(town, school1, ch1, police1, teacher1, kid1));
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public CityTest(Image i1, Image i2, Image i3, Image i4, Image i5, Image i6) {
		image1 = i1;
		image2 = i2;
		image3 = i3;
		image4 = i4;
		image5 = i5;
		image6 = i6;
		addMouseMotionListener(this);
		addMouseListener(this);
	}
    public void mouseDragged(MouseEvent e) {
        imageX = e.getX();
        imageY = e.getY();
    	if((imageX>=pX-100 && imageX<=pX+100) && (imageY>=pY-100  && imageY<=pY+100)) {
    		if(drag==0)
    			drag=1;
    		if(drag==1){
    		pX = imageX;
    		pY = imageY; }}
    	if((imageX>=tX-100 && imageX<=tX+100) && (imageY>=tY-100  && imageY<=tY+100)) {
    		if(drag==0)
    			drag=2;
    		if(drag==2){
    		tX = imageX;
    		tY = imageY; }}
    	if((imageX>=kX-100 && imageX<=kX+100) && (imageY>=kY-100  && imageY<=kY+100)) {
    		if(drag==0)
    			drag=3;
    		if(drag==3){
    		kX = imageX;
    		kY = imageY; }}
        repaint();
      }
      public void mouseMoved(MouseEvent e) {}
      
      public void mouseReleased(MouseEvent e) {
    	  drag=0;
      }
      public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(image1, 0, 0, this);
        g2.drawImage(image2,  1,  150,  this);
        g2.drawImage(image3, 520,  100,  this);
        g2.drawImage(image4, pX, pY, this);
        g2.drawImage(image5,  tX,  tY,  this);
        g2.drawImage(image6, kX, kY, this);
        }

	public void mouseClicked(MouseEvent e) {
        clickX = e.getX();
        clickY = e.getY();
    	if((clickX>=pX-100 && clickX<=pX+100) && (clickY>=pY-100  && clickY<=pY+100)){
    		textField = new JTextField();
    		textField.setBounds(380, 550, 200, 100);
    		add(textField);
    		textField.setColumns(10);
    		textField.setText("Name: Terrence\n");
    	}
	}
	
	public void mouseEntered(MouseEvent arg0) {}

	public void mouseExited(MouseEvent arg0) {}

	public void mousePressed(MouseEvent arg0) {}
}