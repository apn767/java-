class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int b1 = test1();
		System.out.println("main end: " + b1);
	}
	public static int test1()
	{
		System.out.println("from test1");
		int i = 5;
	    return i;
	}
}
