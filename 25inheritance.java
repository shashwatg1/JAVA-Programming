// Inheritance
class motherClass
{
	public void eat()
	{
		System.out.println("I am eat method");
		// Say this same method "eat" is in many classes. It is is demand
		// Now say we want to change it. Then we would have to change all the eat methods in all the classes
		// Thus we want to have just one copy of this method in one class. inheritance comes in here
	}
}
// Only public methods can be inherited. Private methods cannot!

class subclass1 extends motherClass
{ // it gets void eat automatically
} 

class subclass2 extends motherClass
{
	public void eat()
	{
		System.out.println("I am the modified eat method");
		// Here we are overriding the eat method in this particular class
	}
} 

class mainCall
{
	public static void main(String[] args)
	{
		subclass1 s1 = new subclass1();
		subclass2 s2 = new subclass2();
		s1.eat();
		s2.eat();
	}
}