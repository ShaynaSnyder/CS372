/**
 * This class models Kid objects which extend the Person class
 * @author ssnyder19
 */
public class Kid extends Person{
	private String candy, kInfo;
	/**
	 * Function initializes the values of the Kid object's name, age, number, and favorite candy
	 * @param name
	 * @param age
	 * @param number
	 * @param favorite candy
	 */
	public Kid(String n, int a, int num, String c) {
		super(n, a, num);
		candy = c; 
		kInfo = n+"\n"+a+"\n"+num+"\n"+c; }
	/**
	 * Function returns a String of the Kid object's information
	 * @return String information
	 */
	public String getKInfo() {
		return kInfo;
	}
}