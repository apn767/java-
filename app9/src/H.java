class H
{
	public static void main(String[] args) 
	{
		int i = 0;
		if (i++ == 1 && i++ == 0)
		{
			i++;
			System.out.println("if block : " + i++);
			i++;
		}
		System.out.println("main: " + i);
	}
}
