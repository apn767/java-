class G 
{
	G()
	{
		System.out.println("G()");
	}
	G(int i)
	{
		this();
		System.out.println("G(int i)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		G obj1 = new G();
		System.out.println("--------");
		G obj2 = new G();
		System.out.println("--------");
		G obj3 = new G(212);
		System.out.println("--------");
		System.out.println("main end");
	}
}
