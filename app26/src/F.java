class F 
{
	{
		System.out.println("IIB1");
	}
	F()
	{
		this(12);
		System.out.println("F()");
	}
	F(int i)
	{
		System.out.println("F(int)");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		F obj1 = new F();
		System.out.println("----------");
		F obj2 = new F();
		System.out.println("----------");
		System.out.println("main end");
	}
}
