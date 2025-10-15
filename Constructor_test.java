import java.io.*;

public class Contructor_test{
	public static void main(String[] args)
	{
		Pen pen1 = new Pen("red", "ballpoint");
		pen1.write();
	}
}

class Pen{
	String color;
	String type;

	void write()
	{
		System.out.println("Print this fucking stuff!");
		System.out.println(this.color);
		System.out.println(this.type);
	}
	
	Pen(String color, String type)
	{
		this.color = color;
		this.type = type;
	}
}
