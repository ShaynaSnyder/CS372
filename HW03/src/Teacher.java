/**
 * This class models Teacher objects which extend the Person class and implement the Employee interface
 * @author ssnyder19
 */
import java.util.*;

public class Teacher extends Person implements Employee{
	private int gradeLevel;
	private String certification, tInfo;
	private int ID;
	Random rnd = new Random();
	/**
	 * Function initializes the values of the Teacher object's name, age, number, grade level, and certification
	 * @param name
	 * @param age
	 * @param number
	 * @param grade level
	 * @param certification
	 */
	public Teacher(String n, int a, int num, int gl, String c) {
		super(n, a, num);
		gradeLevel = gl;
		certification = c; 
		setID();
		tInfo = n+"\n"+a+"\n"+num+"\n"+gl+"\n"+c+"\n"+getID(); }
	
	/**
	 * Function returns the Teacher object's grade level
	 * @return int grade level
	 */
	public int getGradeLevel() {
		return gradeLevel; }
	/**
	 * Function returns the Teacher object's certification
	 * @return String certification
	 */
	public String getCertification() {
		return certification; }
	
	/**
	 * Function pays Teacher object using Employee interface
	 * @return boolean true
	 */
	public boolean payEmployee(Employee p) {return true;}
	
	/**
	 * Functions sets the value of the Teacher's objects Employee ID
	 */
	public void setID(){
		ID=rnd.nextInt(9999);}
	/**
	 * Function returns the value of the Teacher object's Employee ID
	 * @return int Employee ID
	 */
	public int getID() {
		return ID;}
	/**
	 * Function returns a String of the Teacher object's information
	 * @return String information
	 */
	public String getTInfo() {
		return tInfo; }
}