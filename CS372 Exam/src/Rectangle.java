
public class Rectangle implements Shape{
	private int ID, length, width, area, perimeter;
	private String color;
	public Rectangle(int id, int l, int w, String c){
		ID = id;
		color = c;
		length = l;
		width = w;
		area = l*w;
		perimeter = l+l+w+w;
	}
	public String toString(){
		return getKind()+"(ID#"+ID+")";
	}
	public String getKind(){
		return "Rectangle";
	}
	public String getDetailString(){
		return toString()+"\nColor: "+color+"\nLength: "+length+"Width: "+width+"\nArea: "+area+"\nPerimeter: "+perimeter;
	}
	public int getID(){
		return ID;
	}
}
