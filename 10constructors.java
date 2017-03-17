class constr
{
	private String name;
	public constr(String Name)
	{
		name= Name;
	}
	public void setName(String Name)
	{
		name = Name;
	}
	public String getName()
	{
		return name;
	}
	public void saying()
	{
		System.out.printf("Hello there, %s\n", getName());
	}
	public static void main(String args[])
	{
		constr f = new constr("Hilbert");
		f.saying();
	}
}
