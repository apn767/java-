class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for (; i <= 5; i ++ )
		{
			System.out.println("loop body: " + i++);
		}
		System.out.println("main end " + i);
	}
}
