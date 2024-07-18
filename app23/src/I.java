class I 
{
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I _1 = new I();
		_1.test();
		System.out.println("main end");
	}
}
