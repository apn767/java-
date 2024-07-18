class T
{
	int i;
	public static void test(T obj) 
	{
		System.out.println("test begin");
		
		System.out.println("c:" + obj.i);
		obj.i = 10;
		System.out.println("d:" + obj.i);
		System.out.println("test end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		T ref = new T();
		ref.i = 5;
		System.out.println("a:" + ref.i);
		test(ref);
		System.out.println("b:" + ref.i);
		System.out.println("main end");
	}
}
