/**
 * This abstract class models Building objects which extend JComponent
 * @author ssnyder19
 */
import java.util.ArrayList;
import javax.swing.*;

public abstract class Building extends JComponent{
	String bname, address;
	private ArrayList<String> occupants = new ArrayList<String>();
	/**
	 * Function initializes values of Building object's name and address
	 * @param name of building
	 * @param building address
	 */
	public Building(String b, String a) {
		bname = b;
		address = a; }
	/**
	 * Function gets Building object's name
	 * @return String building name
	 */
	public String getbName() {
		return bname; }
	/**
	 * Function gets Building object's address
	 * @return String address
	 */
	public String getAddress() {
		return address; }
	/**
	 * Function adds people to occupants ArrayList
	 * @param name of person specifies name of occupant
	 */
	public void addOccupants(String n) {
		occupants.add(n); }
	/**
	 * Function gets Building object's ArrayList of occupants
	 */
	public void getOccupants() {
		System.out.printf("\n%s occupants: \n", bname); 
		for(int i=0; i<occupants.size(); i++)
			System.out.printf("%s\n", occupants.get(i)); }
}