class Z25
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(200, 12);
		System.out.println("main end: ");
	}
	public static void test(int i, int j)
	{
		System.out.println("from test: " + i);		
		System.out.println("from test: " + j);		
	}
}
