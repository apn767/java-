class G
{
	static int i;
	static int j = test();

	static int test()
	{
		System.out.println(i);
		i = 30;
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println(i + " done " + j);
	}
}
