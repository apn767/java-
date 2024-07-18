class F 
{
	F()
	{
		System.out.println("F()");
	}
	F(int i)
	{
		System.out.println("F(int i)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		F obj1 = new F();
		System.out.println("--------");
		F obj2 = new F();
		System.out.println("--------");
		F obj3 = new F(212);
		System.out.println("--------");
		System.out.println("main end");
	}
}
