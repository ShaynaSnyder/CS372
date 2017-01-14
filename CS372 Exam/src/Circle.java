import java.util.ArrayList;

public class Circle implements Shape{
	private int ID;
	double radius, area, perimeter;
	private String color;
	final double pi=3.14;
	public Circle(int id, double r, String c){
		ID = id;
		color = c;
		radius = r;
		area = pi*r*r;
		perimeter = 2*pi*r;
	}
	public String toString(){
		return getKind()+"(ID#"+ID+")";
	}
	public String getKind(){
		return "Circle";
	}
	public String getDetailString(){
		return toString()+"\nColor: "+color+"\nRadius: "+radius+"\nArea: "+area+"\nPerimeter: "+perimeter;
	}
	public int getID(){
		return ID;
	}
}
