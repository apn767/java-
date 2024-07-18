class H
{
	static
	{
		System.out.println("from SIB1");
	}
	static int i = test1();
	static int j = test2();

	static
	{
		System.out.println("from SIB2");
	}
	static int test1() 
	{
		System.out.println("from test1");
		return 100;
	}
	static int test2() 
	{
		System.out.println("from test2");
		return 48;
	}
	public static void main(String[] args)
	{
		System.out.println("main:" + i + ", " + j);
	}
}
