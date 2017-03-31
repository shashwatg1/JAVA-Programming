class Animal
{
	
}

class Dog extends Animal
{
	
}

class Fish extends Animal
{
	
}

class DogList extends Animal
{ // This will have an array to hold DOg objects
	
	private Dog[] thelist = new Dog [5];
	private int i=0;

	public void add(Dog d)
	{
		if(i<thelist.length)
		{
			thelist[i]=d;
			System.out.println("Dog added at index "+i);
			i++;
		}
	}
}

class mainClass
{
	public static void main(String[] args)
	{
		DogList dl = new DogList();
		Dog d = new Dog();
		dl.add(d);

		// Now we want a class to hold objects of any type in general, not only Dog
		// We make use of class animalList
		animalList al = new animalList();
		Dog dg = new Dog();
		Fish f = new Fish();
		al.add(d);
		al.add(f);
	}
}

class animalList
{
	private Animal[] thelist = new Animal[5];
	private int i=0;

	public void add(Animal a)
	{
		if(i<thelist.length)
		{
			thelist[i]=a;
			System.out.println("Animal added at index "+i);
			i++;
		}
	}
}