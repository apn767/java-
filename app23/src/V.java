class V 
{
	void test()
	{
		System.out.println("test:" + this);
	}
	public static void main(String[] args) 
	{
		V v1 = new V();
		System.out.println("main: " + v1);
		v1.test();
	}
}
