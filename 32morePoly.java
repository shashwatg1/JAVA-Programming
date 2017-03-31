class Animal
{
	void noise()
	{
		System.out.println("Animal dont make noise");
	}
}

class Dog extends Animal
{
	void noise()
	{
		System.out.println("Ruff");
	}
}

class Fish extends Animal
{
	void noise()
	{
		System.out.println("Glurp");
	}
}

class mainClass
{
	public static void main(String[] args)
	{
		Animal[] al = new Animal[2] ;
		Dog d = new Dog();
		Fish f = new Fish();
		al[0] = d;
		al[1] = f;

		for (Animal x: al)
			x.noise();
	}
}
