class P 
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(true || (i ++ == 0));// the second portion is skipping so it will not affect the value of i
		System.out.println(i);
	}
}
