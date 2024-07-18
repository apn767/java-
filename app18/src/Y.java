class Y
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		int i = test();
		System.out.println("in the main: " + i);
		System.out.println("from main end");
	}
	public static int test()
	{
		System.out.println("from test");
		return 100;
	}
} 
