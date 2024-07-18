class U
{
	int i;
	public static U test() 
	{
		System.out.println("test begin");
		U obj = new U();
		System.out.println("c:" + obj.i);
		obj.i = 10;
		System.out.println("d:" + obj.i);
		System.out.println("test end");
		return obj;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		U ref = test();
		System.out.println("a:" + ref.i);
		System.out.println("main end");
	}
}
