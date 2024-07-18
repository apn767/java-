class K 
{
	static int i = test();
	static int j;

	static int test()
	{
		return j;//indirect read
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
