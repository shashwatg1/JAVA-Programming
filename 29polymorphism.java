// Polymorphism
// uses inheritance in one way or another
class polyFood
{
	void eat()
	{
		System.out.println("This food is great!");
	}
}

class polyTuna extends polyFood
{
	void eat() 
	{// overriding
		System.out.println("This Tuna is great!");
	}
}

class polyPotpie extends polyFood
{
	void eat()
	{// overriding
		System.out.println("This Potpie is great!");
	}
}

class polyMain
{
	public static void main(String[] args)
	{
		polyTuna t1 = new polyTuna();
		polyFood t2 = new polyTuna(); // polymorphism

		// polymorphic arrays
		polyFood arr[] = new polyFood[2];
		arr[0] = new polyPotpie();
		arr[1] = new polyTuna();

		for (int x=0;x<2;x++)
			arr[x].eat();

		polyFatty f = new polyFatty();
		polyFood f0 = new polyFood();
		polyFood po = new polyPotpie();
		f.digest(f0);
		f.digest(po);
	}
}

class polyFatty
{
	void digest(polyFood x)
	{
		x.eat();
	}
}

// if classA is mother of classB,classC
// classA xyz, makes a object xyz which can now accept subclasses,methods from A,B,C all

// while overriding, we cant change return type or parameters or access type. Consistency must be maintained
