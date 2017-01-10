//city class
import java.util.ArrayList;
import javax.swing.*;
public class City extends JComponent{
	//creates array lists to hold people and buildings
	private ArrayList<Person> people = new ArrayList<Person>();
	private ArrayList<Building> buildings = new ArrayList<Building>();
	private ArrayList<Police> police = new ArrayList<Police>();
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Kid> kids = new ArrayList<Kid>();
	private CityHall cityHall;
	private School school;
	
	//public void functions to add people and buildings to array lists and output names
	public void addPeople(Person p) {
		people.add(p);
		System.out.printf("%s\n", p.getName());}
	public void addBuildings(Building b) {
		buildings.add(b);
		System.out.printf("%s\n", b.getbName());}
	public void addPolice(Police p) {
		police.add(p); }
	public void addTeachers(Teacher t) {
		teachers.add(t); }
	public void addKids(Kid k) {
		kids.add(k); }
	public void addCityHall(CityHall ch) {
		cityHall = ch; }
	public void addSchool(School s) {
		school = s; }
	
	//functions to add occupants to buildings and output occupants
	public void addOcc() {
		for(int a=0; a<police.size(); a++)
			cityHall.addOccupants(police.get(a).getName());
		for(int b=0; b<teachers.size(); b++)
			school.addOccupants(teachers.get(b).getName());
		for(int c=0; c<kids.size(); c++)
			school.addOccupants(kids.get(c).getName()); }
	public void getOcc() {
		for(int i=0; i<buildings.size(); i++)
			buildings.get(i).getOccupants();}
	
	//function to pay employees
	public void payEmployees() {}
}