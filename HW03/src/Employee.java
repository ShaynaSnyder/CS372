/**
 * Employee interface to pay employees and get ID numbers
 * @author ssnyder19
 */
import java.util.*;

public interface Employee{
	public int ID = 1234;
	boolean payEmployee(Employee p);
	public void setID();
	public int getID();
}