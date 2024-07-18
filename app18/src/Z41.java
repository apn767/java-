class Z41
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		test(i = 18);
		System.out.println("main end: "  + i);
	}
	public static void test(int i)
	{
		i = 132;
		System.out.println("from test: " + i);	

	}
}
 