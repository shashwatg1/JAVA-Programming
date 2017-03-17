class forLoop
{
	public static void main(String args[])
	{
		double a=0,p=1000,k=0.1; // Compound interest
		for (int i=1;i<=5;i++)
		{
			a = p*Math.pow(1+k,i);
			System.out.println("Amount for "+i+" years = "+a);
		}
	}
}
