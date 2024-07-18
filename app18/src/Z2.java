class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		System.out.println(test() + " in the main:");
		System.out.println("from main end");
	}
	public static boolean test()
	{
		System.out.println("from test");
		return true;
	}
} 
