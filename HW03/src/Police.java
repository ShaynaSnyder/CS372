//class for police that is a part of person class
public class Police extends Person implements Employee{
	public enum Role {Patrol, Sargent, Captain, Chief}
	private Role role;
	private int ID;
	public Police(String n, int a, int num, Role r) {
		super(n, a, num);
		role = r;}
	
	//get function to get police role
	public Role getRole() {return role;}
	
	//function to pay employee
	public boolean payEmployee(Employee p) {return true;}
	
	//functions to get and set employee ID number
	public void setID(int ID) {
		
	}
	public void getID() {
		
	}
}