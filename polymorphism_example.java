import java.io.*;

public class polymorphism_example
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.write("Pata nahi, kya likhna hai!");
		s1.write(69);
	}
}

class Student
{
	void write(int number)
	{
		//System.out.println(name);
		System.out.print(number + "\n");
	}
	void write(String name)
	{
		System.out.println(name);
	}
}
