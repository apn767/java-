class S 
{
	int i;
	public static void test() 
	{
		System.out.println("test begin");
		P obj = new P();
		System.out.println(obj.i);//0
		obj.i = 10;
		System.out.println(obj.i);//10
		System.out.println("test end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
