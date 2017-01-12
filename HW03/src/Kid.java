//class for kid that is a part of the person class
public class Kid extends Person{
	private String candy, kInfo;
	public Kid(String n, int a, int num, String c) {
		super(n, a, num);
		candy = c; 
		kInfo = n+"\n"+a+"\n"+num+"\n"+c; }
	public String getKInfo() {
		return kInfo;
	}
}