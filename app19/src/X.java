class X
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("main: " + i);
		test();
		X.test();
	}
	public static void test()
	{
		System.out.println("test:" + i);
	}
}
