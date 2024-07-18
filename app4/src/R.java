class R 
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println((i++ == 0) || (i++ == 1));//only first expression executed so i will be incremented only once the second expression is skipping
		System.out.println(i);
	}
}
