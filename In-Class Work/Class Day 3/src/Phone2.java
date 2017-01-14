//static numbers (from slides) with general phone behaviors
import java.util.Random;
public abstract class Phone2{
	private static int lastnumber = 1111111;
	private int number;
	public Phone2() {
		number = lastnumber;
		lastnumber++;
	}
	public String toString() {
		return String.format("%d-%d", number/10000, number%10000);
	}
	public boolean call(Phone2 dest) {
		return dest.receive(this);
	}
	public boolean receive(Phone2 src) {
		Random r = new Random();
		boolean answered = (r.nextInt()%2 == 1);
		if(answered)
			answer(src);
		else
			ignore(src);
		return answered;
	}
	abstract void answer(Phone2 src);
	abstract void ignore(Phone2 src);
}