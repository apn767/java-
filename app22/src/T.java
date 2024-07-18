class A 
{
	static void test()
	{
		System.out.println("From A.test");
	}
	static
	{
		System.out.println("From A.SIB");
	}
}
class B 
{
	static void test()
	{
		System.out.println("From B.test");
	}
	static
	{
		System.out.println("From B.SIB");
	}
}
class T
{
	static
	{
		System.out.println("from S.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A.test();
		System.out.println("----------");
		B.test();
		System.out.println("----------");
		System.out.println("main end");
	}
}
