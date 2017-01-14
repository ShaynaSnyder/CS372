
public class Mobile extends Phone2 implements Textable{
	public boolean sendText(Textable p) {
		return true;
	}
	public void answer(Phone2 src){}
	public void ignore(Phone2 src){}
}
