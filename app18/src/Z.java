class Z
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		boolean i = test();
		System.out.println("in the main: " + i);
		System.out.println("from main end");
	}
	public static boolean test()
	{
		System.out.println("from test");
		return true;
	}
} 
