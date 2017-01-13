/**
 * This class models Police objects which extend the Person class and implement the Employee interface
 * @author ssnyder19
 */
import java.util.*;

public class Police extends Person implements Employee{
	public enum Role {Patrol, Sargent, Captain, Chief}
	private Role role;
	private int ID;
	private String pInfo;
	Random rnd = new Random();
	/**
	 * Function initializes the Police object's name, age, number, and role
	 * @param name
	 * @param age
	 * @param number
	 * @param role
	 */
	public Police(String n, int a, int num, Role r) {
		super(n, a, num);
		role = r;
		setID();
		pInfo = n+"\n"+a+"\n"+num+"\n"+r+"\n"+getID();}
	
	/**
	 * Function returns the value of the Police object's role
	 * @return Role role
	 */
	public Role getRole() {return role;}
	
	/**
	 * Function pays the Police object using Employee interface
	 * @return boolean true
	 */
	public boolean payEmployee(Employee p) {return true;}
	
	/**
	 * Function sets the value of the Police object's Employee ID
	 */
	public void setID() {
		ID=rnd.nextInt(9999);}
	/**
	 * Function returns the value of the Police object's Employee ID
	 * @return int Employee ID
	 */
	public int getID() {
		return ID;}
	/**
	 * Function returns a String of the Police object's information
	 * @return String information
	 */
	public String getPInfo() {
		return pInfo; }
}