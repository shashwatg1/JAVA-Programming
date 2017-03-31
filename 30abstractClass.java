/*
Idea of Abstract Class

in plymosphism we create a general class like food and then make specialized classes link tuna,etc with much more features
We tend to avoid:
	food f = new food()
and we stick to:
	food f = new tuna(), etc
This is because food f = new food() is too generalized with very little feature.
This leads to the idea of abstract classes

We cannot create objects of abstract classes. We only use it for inheritance and polymorphism.

Classes whicha re not abstract are Concrete.

We have Abstract methods aswell. They are methods that MUST be overridden!
IT is compulsory for subclasses to implement the abstract methods
*/

abstract class polyFood
{
	public abstract void eat(); // no need for body as it will be overridden
}

class polyFatty
{
//	polyFood f0 = new polyFood(); // this is an error as you cant create an object of abstract class
	polyFood f0 = new polyTuna(); // This is allowed

	public void digest(polyFood x)
	{
		x.eat();
	}
}

class polyTuna extends polyFood
{ // must implement void eat()
	public void eat() 
	{ // overriding
		System.out.println("This Tuna is great!");
	}
}

class polyPotpie extends polyFood
{ // must implement void eat()
	public void eat()
	{ // overriding
		System.out.println("This Potpie is great!");
	}
}
