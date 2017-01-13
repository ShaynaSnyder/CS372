/**
 * This class provides information and graphics for the other classes
 * @author ssnyder19
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.*;

public class CityTest extends JComponent implements MouseMotionListener, MouseListener{
	
	int imageX, imageY, clickX, clickY, drag=-1, a=0;
	int inSchool[] = {0,0,0,0,0,0,0,0,0};
	int inCH[] = {0,0,0,0,0,0,0,0,0};
    int[] x={625, 330, 30, 100, 420, 745, 220, 530, 850};
    int[] y={0, 0, 0, 5, 0, 20, 20, 25, 15};
	String sOcc="", chOcc="";
	Image image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12;
	Image[] imgs = {image4, image5, image6, image7, image8, image9, image10, image11, image12};
	JFrame frame;
	private JTextArea text;
	private JTextArea text2;
	
	//creates police, teacher, and kid objects
	public static Police[] police = {new Police("Terrence", 29, 1234567, Police.Role.Sargent), new Police("Charlie", 31, 8546732, Police.Role.Captain), new Police("Barry", 56, 9712322, Police.Role.Chief)};
	public static Teacher[] teachers = {new Teacher("Wynter", 41, 4543276, 7, "Bachelor's"), new Teacher("Sherlock", 23, 7658779, 2, "Master's"), new Teacher("Amy", 57, 8764545, 9, "Bachelor's")};
	public static Kid[] kids = {new Kid("Shayna", 7, 6104553, "Kit Kat"), new Kid("Cheree", 15, 7843454, "M&M's"), new Kid("Willy", 9, 8773434, "Twix")};
	/**
	 * main function to test the City class
	 * @param args
	 */
	public static void main(String[] args) {
		//creates city object
		City city = new City();
		
		//adds people to people array list and outputs city occupants
		for(int d=0; d<police.length; d++) {
			city.addPeople(police[d]);
			city.addPolice(police[d]); }
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
		
		//using resources
		String townPic = "/resources/landscape.png";
		Image town = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(townPic));
		town = town.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
		
		String schoolPic = "/resources/school.png";
		Image school1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(schoolPic));
		school1 = school1.getScaledInstance(350, 350, Image.SCALE_SMOOTH);
		
		String cityHallPic = "/resources/cityhall.png";
		Image ch1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(cityHallPic));
		ch1 = ch1.getScaledInstance(470, 380, Image.SCALE_SMOOTH);
		
		String police1Pic = "/resources/police1.png";
		Image police1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(police1Pic));
		police1 = police1.getScaledInstance(95, 135, Image.SCALE_SMOOTH);
		
		String police2Pic = "/resources/police2.png";
		Image police2 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(police2Pic));
		police2 = police2.getScaledInstance(80, 130, Image.SCALE_SMOOTH);
		
		String police3Pic = "/resources/police3.jpg";
		Image police3 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(police3Pic));
		police3 = police3.getScaledInstance(90, 130, Image.SCALE_SMOOTH);
		
		String teacher1Pic = "/resources/teacher1.png";
		Image teacher1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(teacher1Pic));
		teacher1 = teacher1.getScaledInstance(145, 135, Image.SCALE_SMOOTH);
		
		String teacher2Pic = "/resources/teacher2.png";
		Image teacher2 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(teacher2Pic));
		teacher2 = teacher2.getScaledInstance(100, 140, Image.SCALE_SMOOTH);
		
		String teacher3Pic = "/resources/teacher3.png";
		Image teacher3 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(teacher3Pic));
		teacher3 = teacher3.getScaledInstance(90, 110, Image.SCALE_SMOOTH);
		
		String kid1Pic = "/resources/kid1.png";
		Image kid1 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(kid1Pic));
		kid1 = kid1.getScaledInstance(100, 120, Image.SCALE_SMOOTH);
		
		String kid2Pic = "/resources/kid2.png";
		Image kid2 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(kid2Pic));
		kid2 = kid2.getScaledInstance(75, 100, Image.SCALE_SMOOTH);
		
		String kid3Pic = "/resources/kid3.png";
		Image kid3 = Toolkit.getDefaultToolkit().getImage(CityTest.class.getResource(kid3Pic));
		kid3 = kid3.getScaledInstance(100, 120, Image.SCALE_SMOOTH);
		
		JFrame frame = new JFrame("DragImage");
		frame.getContentPane().add(new CityTest(town, school1, ch1, police1, police2, police3, teacher1, teacher2, teacher3, kid1, kid2, kid3));
		frame.setSize(1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
	
	/**
	 * Initializes the values of the imgs array to the Images
	 * @param 11 Image objects show which images to add to city
	 */
	public CityTest(Image i1, Image i2, Image i3, Image i4, Image i5, Image i6, Image i7, Image i8, Image i9, Image i10, Image i11, Image i12) {
		image1 = i1;
		image2 = i2;
		image3 = i3;
		imgs[0] = i4;
		imgs[1] = i5;
		imgs[2] = i6;
		imgs[3] = i7;
		imgs[4] = i8;
		imgs[5] = i9;
		imgs[6] = i10;
		imgs[7] = i11;
		imgs[8] = i12;
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	/**
	 * Function allows people images to move when mous is dragged
	 */
    public void mouseDragged(MouseEvent e) {
        imageX = e.getX();
        imageY = e.getY();
        if(drag==-1){
        for(int q=0; q<9; q++) {
    	if((imageX>=x[q] && imageX<=x[q]+100) && (imageY>=y[q]  && imageY<=y[q]+100)) {
    			drag=q;
    			a=q;
    			break;}}}
        
		if(drag==a){
		x[a] = imageX;
		y[a] = imageY; }
		
        repaint();
      }
      public void mouseMoved(MouseEvent e) {}
      /**
       * Function allows people images to "enter" buildings when left on building images
       */
      public void mouseReleased(MouseEvent e){
          for(int l=3; l<9; l++){
          	if((x[l]>10 && x[l]<250) && (y[l]>240 && y[l]<380)) {
          		inSchool[l] = 1;}}
          for(int l=0; l<3; l++){
          	if((x[l]>500 && x[l]<850) && (y[l]>200 && y[l]<400)) {
          		inCH[l] = 1;}}
          repaint();
    	  drag=-1;
    	  a=0;}
      /**
       * Function paints images depending on current image locations
       */
      public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(image1, 0, 0, this);
        g2.drawImage(image2,  10,  150,  this);
        g2.drawImage(image3, 520,  130,  this);
        for(int r=0; r<9; r++){
        	if(inSchool[r]!=1 && inCH[r]!=1){
        		g2.drawImage(imgs[r], x[r], y[r], this);}}
        if(text!=null){
        text.repaint();
        text2.repaint();}}
      /**
       * Function outputs stats in text area when people or buildings are clicked
       */
	public void mouseClicked(MouseEvent e){
        clickX = e.getX();
        clickY = e.getY();
		text = new JTextArea();
		text2 = new JTextArea();
		text.setBounds(380, 550, 100, 100);
		text2.setBounds(480, 550, 100, 100);
		add(text);
		add(text2);
		text.setEditable(false);
		text2.setEditable(false);
		if((clickX>10 && clickX<350) && (clickY>240 && clickY<480)) {
			for(int l=3; l<9; l++){
          		if(inSchool[l] == 1){
          			if(l<6){
          				sOcc = sOcc + teachers[l-3].getName() + "\n";
          				inSchool[l]=0;
          				x[l]=l*100-300;
          				y[l]=400;}
          			else{
          				sOcc = sOcc + kids[l-6].getName() + "\n";
          				inSchool[l]=0;
          				x[l]=l*100-300;
          				y[l]=400;}}}
    		text.setText(" School\n Occupants:\n");
    		text2.setText(sOcc);
    		sOcc="";}
		else if((clickX>550 && clickX<950) && (clickY>200 && clickY<480)) {
			for(int k=0; k<3; k++){
          		if(inCH[k] == 1){
          			chOcc = chOcc + police[k].getName() + "\n";
          			inCH[k]=0;
          			x[k]=k*100+600;
          			y[k]=400;}}
    		text.setText(" City Hall\n Occupants:\n");
    		text2.setText(chOcc);
    		chOcc="";}
		else{
			for(int i=0; i<3; i++) {
				if((clickX>=x[i] && clickX<=x[i]+100) && (clickY>=y[i]  && clickY<=y[i]+100) && inCH[i]==0){
					text.setText(" Name:\n Age:\n Phone Number:\n Role:\n Employee ID:");
					text2.setText(police[i].getPInfo()); }
				else if((clickX>=x[i+3] && clickX<=x[i+3]+100) && (clickY>=y[i+3]  && clickY<=y[i+3]+100) && inSchool[i+3]==0){
					text.setText(" Name:\n Age:\n Phone Number:\n Grade Level:\n Certification:\n Employee ID:");
					text2.setText(teachers[i].getTInfo()); }
				else if((clickX>=x[i+6] && clickX<=x[i+6]+100) && (clickY>=y[i+6]  && clickY<=y[i+6]+100) && inSchool[i+6]==0){
					text.setText(" Name:\n Age:\n Phone Number:\n Favorite Candy:");
					text2.setText(kids[i].getKInfo());}}}}
	
	public void mouseEntered(MouseEvent arg0) {}

	public void mouseExited(MouseEvent arg0) {}

	public void mousePressed(MouseEvent arg0) {}
}