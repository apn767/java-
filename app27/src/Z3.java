class A
{
	static 
	{
		System.out.println("A.SIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("B.SIB");
	}
}
class C extends B
{
	static 
	{
		System.out.println("C.SIB");
	}
}
class Z3
{
	static 
	{
		System.out.println("Z3.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = new B();
		System.out.println("------------");
        A a1 = new A();
		System.out.println("main end");
	}
}
