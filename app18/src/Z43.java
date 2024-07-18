class Z43
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x = 3;
		test(x + 18);
		System.out.println("main end: "  + x);
	}
	public static void test(int i)
	{
		System.out.println("from test: " + i);	
        i = 40;
	}
}
 