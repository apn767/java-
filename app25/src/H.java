class H 
{
	H()
	{
	    this(12);
		System.out.println("H()");
	}
	H(int i)
	{
		System.out.println("H(int i)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		H obj1 = new H();
		System.out.println("--------");
		H obj2 = new H();
		System.out.println("--------");
		H obj3 = new H(212);
		System.out.println("--------");
		System.out.println("main end");
	}
}
