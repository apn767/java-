class T
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		for (; i < 50; i ++ )
		{
			System.out.println("loop body: " + i);
		}
		System.out.println("main end " + i);
	}
}
