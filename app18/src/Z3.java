class Z3
{
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		int i = 10 + test();
		System.out.println("------------------");
		System.out.println(test() + " in the main@a:");
		System.out.println("-------------------");
		System.out.println(i + test() + " in the main@b:");
		System.out.println("--------------------");
		System.out.println(i + test() + test() + " in the main@c:");
		System.out.println("--------------------");
		System.out.println("@d: " + i + test() + test() + test());
		System.out.println("from main end");
	}
	public static int test()
	{
		System.out.println("from test");
		return 100;
	}
} 
