package pkgCore;

public class Dog extends Animal
{
	String name;
	int numLegs;
	
	Dog(String name, int numLegs)
	{
		super.name = name;
		super.numLegs = numLegs;
	}
	
	public String toString()
	{
		return super.name + ", " + super.numLegs;
	}

}
