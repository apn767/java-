class G 
{
	static int p;
	G()
	{
		p += 10;
	}
	{
		p += 20;
	}
	void test1()
	{
		p += 30;
	}
	static void test2()
	{
		p += 40;
	}
	public static void main(String[] args) 
	{
		System.out.println("a: " + p);
		G obj1 = new G();
		System.out.println("b: " + p);
		obj1.test1();
		System.out.println("c: " + p);
		test2();
		System.out.println("d: " + p);
	}
}
