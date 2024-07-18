class A 
{
	static int i;
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
	static int j;
	static void test()
	{
		System.out.println("From B.test");
	}
	static
	{
		System.out.println("From B.SIB");
	}
}
class U
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
		System.out.println(A.i);
		System.out.println("----------");
		System.out.println(B.j);
		System.out.println("----------");
		A.test();
		System.out.println("----------");
		B.test();
		System.out.println("main end");
	}
}
