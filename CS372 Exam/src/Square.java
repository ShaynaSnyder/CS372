
public class Square implements Shape{
	private int ID, side, area, perimeter;
	private String color;
	public Square(int id, int s, String c){
		ID = id;
		color = c;
		side = s;
		area = s*s;
		perimeter = 4*s;
	}
	public String toString(){
		return getKind()+"(ID#"+ID+")";
	}
	public String getKind(){
		return "Square";
	}
	public String getDetailString(){
		return toString()+"\nColor: "+color+"\nSide: "+side+"\nArea: "+area+"\nPerimeter: "+perimeter;
	}
	public int getID(){
		return ID;
	}
}
