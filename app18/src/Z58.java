class Z58
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 3;
		int j = test(i++) + i + i;
		System.out.println("main end: "  + i + ", " + j);
	}
	public static int test(int i)
	{
		System.out.println("from test: " + i);	
        return ++i;
	}
}
 