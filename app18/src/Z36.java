class Z36
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10,true,30);
		System.out.println("main end: " );
	}
	public static void test(int i, boolean j, int k)
	{
		System.out.println("from test: " + i);			
		System.out.println("from test: " + j);			
		System.out.println("from test: " + k);			
	}
}
 