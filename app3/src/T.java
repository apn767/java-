class T 
{
	public static void main(String[] args) 
	{
		int i = 8;
		int j = ++i  +i   +  ++i  +  --i  + i;
		//       9    9       10      9     9
		System.out.println(i);//9
		System.out.println(j);//46
	}
}
