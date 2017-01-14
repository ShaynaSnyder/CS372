//cloning in class
import java.util.Random;
public class Phone1 {
	private int number;
	private Random rnd = new Random();
	public Phone1() {
		number = rnd.nextInt(9000000) + 1000000;
	}
	public Phone1(int number) {
		this.number = number;
	}
	public String toString() {
		return String.format("%d-%d", number/10000, number%10000);
	}
	public Object clone() {
		return new Phone1(number);
	}
	public boolean equals(Object p) {
		if(p instanceof Phone1)
			return true;
		else
			return false;
	}
}
