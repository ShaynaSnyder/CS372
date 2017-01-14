//random numbers (from slides)
public class PhoneTest {
	public static void main(String[] args) {
		Phone p1 = new Phone(1234567), p2 = new Phone(2345678), p3 = new Phone(), p4 = new Phone();
		System.out.printf("Phone #1: %s\n", p1.toString());
		System.out.printf("Phone #2: %s\n", p2.toString());
		System.out.printf("Phone #3: %s\n", p3.toString());
		System.out.printf("Phone #4: %s\n", p4.toString());
	}
}
