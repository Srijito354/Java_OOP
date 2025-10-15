public class interfaces
{
	public static void main(String[] args)
	{
		Horse h = new Horse();
		h.walk();
		System.out.println(h.eyes);
		h.eats();
		
		Human H = new Human();
		H.walk();
		System.out.println(H.eyes);
		H.eats();
	}
}

interface Animal
{
	int eyes = 2;
	void walk();
}

interface Herbivore
{
	void eats();
}

interface Carnivore
{
}

class Horse implements Animal, Herbivore
{
	public void walk()
	{
		System.out.println("Walks on 4 legs!");
	}
	public void eats()
	{
		System.out.println("Eats grass!");
	}
}

class Human implements Animal, Carnivore
{
	public void walk()
	{
		System.out.println("Walks on 2 legs!");
	}
	public void eats()
	{
		System.out.println("Eats meat!");
	}
}
