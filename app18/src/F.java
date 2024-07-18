class F
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		test();
		System.out.println("from main end1");
		test();
		System.out.println("from main end2");
		test();
		System.out.println("from main end3");
		test();
		System.out.println("from main end4");
	}
	public static void test()
	{
		System.out.println("from test");
	}
}
