// We are talking about a Club here
class staticClass
{
	private String first,last;
	private static int members = 0;
	// Since static, every object shares this same variable. If it changes then it is for all objects
	public staticClass(String f,String l)
	{
		first = f;
		last = l;
		members++;
		System.out.printf("Constructor for %s %s, members in the club: %d\n",first,last,members);
	}
	public String getFirst()
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}
	public static int getMembers()
	{
		return members;
	}
}

class callClass
{
	public static void main(String[] args)
	{
		staticClass s1 = new staticClass("Megan","Fox");
		staticClass s2 = new staticClass("Mila","Kunis");
		staticClass s3 = new staticClass("Taylor","Swift");
		// Thus the names are private to all but members is common to all. Shared with all.
		System.out.println(s1.getFirst());
		System.out.println(s1.getLast());
		System.out.println(s1.getMembers());
		// Also since static doesnt change between objects, it doesnt even require an object. It is a class variable.
		System.out.println(staticClass.getMembers()); // referenced using the class. Only possible with static
	}
}
