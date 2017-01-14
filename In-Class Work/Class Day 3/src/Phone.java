// random numbers (from slides)
import java.util.Random;
public class Phone {
	private int number;
	private Random rnd = new Random();
	public Phone() {
		number = rnd.nextInt(9000000) + 1000000;
	}
	public Phone(int number) {
		this.number = number;
	}
	public String toString() {
		return String.format("%d-%d", number/10000, number%10000);
	}
}
