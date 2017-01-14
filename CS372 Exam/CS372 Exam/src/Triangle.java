
public class Triangle implements Shape{
	private int ID;
	double side1, side2, side3, area, perimeter, temp;
	private String color;
	public Triangle(int id, double s1, double s2, double s3, String c){
		ID = id;
		color = c;
		side1 = s1;
		side2 = s2;
		side3 = s3;
		temp = (s1+s2+s3)/2;
		area = Math.sqrt(temp*(temp-s1)*(temp-s2)*(temp-s3));
		perimeter = s1+s2+s3;
	}
	public String toString(){
		return getKind()+"(ID#"+ID+")";
	}
	public String getKind(){
		return "Triangle";
	}
	public String getDetailString(){
		return toString()+"\nColor: "+color+"\nSides: "+side1+", "+side2+", "+side3+"\nArea: "+area+"\nPerimeter: "+perimeter;
	}
	public int getID(){
		return ID;
	}
}
