//abstract class person that contains police, teacher, and kid classes
import javax.swing.*;
public abstract class Person extends JComponent{
	private String name;
	private int age, number;
	public Person(String n, int a, int num){
		name = n; 
		age = a;
		number = num; }
	
	//get functions to get name, age, and number variables
	public String getName() {
		return name; }
	public int getAge() {
		return age; }
	public int getNumber() {
		return number; }
}