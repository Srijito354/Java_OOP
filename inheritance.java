import java.io.*;

public class inheritance
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		//t.area(5, 6);
		t.color = "blue";
		System.out.println(t.color);
		//Shape s = new Shape();
		//s.area();
	}
}

class Shape{
	String color = "red";
	//public void area(){
	//	System.out.println("Prints area!");
		
	//}
}

class Triangle extends Shape{
	//public void area(int l, int b){
	//	System.out.println("Area: " + l*b);
	//}
}
