
public class EmployeeEntry {
	private static final int MinNumber = 1110000;
	private static int LastNumber = MinNumber;
	private int _number;
	private String _name;
	private int _ID;
	public EmployeeEntry(String name, int ID){
		_name = name;
		_ID = ID;
		_number = LastNumber;
		LastNumber++;}
	public String getName(){return _name;}
	public int getID(){return _ID;}
	public String getNumber(){return String.format("%d-%04d", _number/10000, _number%10000)};
	public Integer getIntNumber(){return _number;}
	public String toString(){return String.format("%s, %d, %s", getName(), getID(), getNumber());}
}
