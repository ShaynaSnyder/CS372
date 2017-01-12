//class for teacher that is a part of the person class
public class Teacher extends Person implements Employee{
	private int gradeLevel;
	private String certification, tInfo;
	private int ID;
	public Teacher(String n, int a, int num, int gl, String c) {
		super(n, a, num);
		gradeLevel = gl;
		certification = c; 
		tInfo = n+"\n"+a+"\n"+num+"\n"+gl+"\n"+c; }
	
	//get functions to get teacher grade level and certification
	public int getGradeLevel() {
		return gradeLevel; }
	public String getCertification() {
		return certification; }
	
	//function to pay employee
	public boolean payEmployee(Employee p) {return true;}
	
	//functions to get and set employee ID number
	public void setID(int ID) {
		
	}
	public void getID() {
		
	}
	public String getTInfo() {
		return tInfo; }
}