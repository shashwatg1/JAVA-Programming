// Enumeration. Should have same name as file name
import java.util.EnumSet; // needed for enum set range only
public enum enumeration22
{ // now we define some variables that will not change. Remain Constant. They will essentially be objects.
	shash("xyz", "20"),
	gupta("abcd","18"),
	name("efgh","16"),
	name2("dsad","22"),
	name3("gfgdf","15");
	// Jave puts these constants/objects in an array which is called "enumeration22.values()"

	private final String description,year; // varaibles

	//enumeration22 constructor
	enumeration22(String d, String y)
	{
		description = d;
		year = y;
	}
	// The objective is to give the object shashwat the description = xyz and year = 20 and so on

	public String getDesc()
	{
		return description;
	}
	public String getYear()
	{
		return year;
	}
}

class callEnum
{
	public static void main(String[] args)
	{
		for(enumeration22 people : enumeration22.values())
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

		System.out.println("\nNow for the range of constants\n");
		// enumset range allows to access and portion of the array
		for(enumeration22 people : EnumSet.range(enumeration22.gupta, enumeration22.name2))
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
	}
}
