//abstract class building that contains city hall and school classes
import java.util.ArrayList;
import javax.swing.*;
public abstract class Building extends JComponent{
	String bname, address;
	private ArrayList<String> occupants = new ArrayList<String>();
	public Building(String b, String a) {
		bname = b;
		address = a; }
	
	//get functions to get name and address variables
	public String getbName() {
		return bname; }
	public String getAddress() {
		return address; }
	
	//functions to add and output building occupants
	public void addOccupants(String n) {
		occupants.add(n); }
	public void getOccupants() {
		System.out.printf("\n%s occupants: \n", bname); 
		for(int i=0; i<occupants.size(); i++)
			System.out.printf("%s\n", occupants.get(i)); }
}