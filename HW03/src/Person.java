/**
 * This abstract class models Person objects which extend JComponent
 * @author ssnyder19
 */
import javax.swing.*;

public abstract class Person extends JComponent{
	private String name;
	private int age, number;
	/**
	 * Function initializes values of the Person object's name, age, and number
	 * @param name
	 * @param age
	 * @param number
	 */
	public Person(String n, int a, int num){
		name = n; 
		age = a;
		number = num; }
	
	/**
	 * Function returns the value of the Person object's name
	 * @return String name
	 */
	public String getName() {
		return name; }
	/**
	 * Function returns the value of the Person object's age
	 * @return int Age
	 */
	public int getAge() {
		return age; }
	/**
	 * Function returns the value of the Person object's number
	 * @return int number
	 */
	public int getNumber() {
		return number; }
}