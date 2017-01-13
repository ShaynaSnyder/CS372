/**
 * This class models a city with people and buildings
 * @author ssnyder19
 */
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
	/**
	 * Add Person objects to the people ArrayList
	 * @param Person p specifies which person to add to city
	 */
	public void addPeople(Person p) {
		people.add(p); }
	/**
	 * Add Building objects to the buildings ArrayList
	 * @param Building b specifies which building to add to city
	 */
	public void addBuildings(Building b) {
		buildings.add(b); }
	/**
	 * Add Police objects to the police ArrayList
	 * @param Police p specifies which police to add to city
	 */
	public void addPolice(Police p) {
		police.add(p); }
	/**
	 * Add Teacher objects to the teachers ArrayList
	 * @param Teacher t specifies which teacher to add to city
	 */
	public void addTeachers(Teacher t) {
		teachers.add(t); }
	/**
	 * Add Kid objects to the kids ArrayList
	 * @param Kid k specifies which kid to add to city
	 */
	public void addKids(Kid k) {
		kids.add(k); }
	/**
	 * Initialize CityHall object in City
	 * @param CityHall ch specifies which city hall to add to city
	 */
	public void addCityHall(CityHall ch) {
		cityHall = ch; }
	/**
	 * Initialize School object in City
	 * @param School s specifies which school to add to city
	 */
	public void addSchool(School s) {
		school = s; }
	/**
	 * Add police, teachers, and kids to Building objects' occupants ArrayLists
	 */
	public void addOcc() {
		for(int a=0; a<police.size(); a++)
			cityHall.addOccupants(police.get(a).getName());
		for(int b=0; b<teachers.size(); b++)
			school.addOccupants(teachers.get(b).getName());
		for(int c=0; c<kids.size(); c++)
			school.addOccupants(kids.get(c).getName()); }
	/**
	 * Returns Building objects' occupants ArrayLists
	 */
	public void getOcc() {
		for(int i=0; i<buildings.size(); i++)
			buildings.get(i).getOccupants();}
	/**
	 * Pays employees
	 */
	public void payEmployees() {}
}