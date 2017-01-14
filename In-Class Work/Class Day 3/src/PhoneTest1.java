//cloning in class
public class PhoneTest1 {
	public static void main(String[] args) {
		Phone1 p1 = new Phone1();
		System.out.printf("Phone #1: %s\n", p1.toString());
		Phone1 p2 = (Phone1)p1.clone();
		if(p2 != null) {
			System.out.printf("Phone #2: %s\n", p2.toString());
			if(p1.equals(p2))
				System.out.printf("equal\n");
			else
				System.out.printf("not equal\n");
		}
	}
}
