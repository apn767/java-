class I 
{
	I()
	{
	    this(12);
		System.out.println("I()");
	}
	I(int i)
	{
		this(i, i);
		System.out.println("I(int i)");
	}
	I(int i, int j)
	{
		System.out.println("I(int i, int j)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I obj1 = new I();
		System.out.println("--------");
		I obj2 = new I();
		System.out.println("--------");
		I obj3 = new I(212);
		System.out.println("--------");
		I obj4 = new I(212, 54);
		System.out.println("--------");
		System.out.println("main end");
	}
}
