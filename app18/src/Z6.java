class Z6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double b1 = test();
		System.out.println("main end: " + test());
	}
	public static double test()
	{
		System.out.println("from test");
	    return 1.5;
	}
}
