class J
{
	public static void main(String[] args) 
	{
		int m = 10, n = 20, o = 15;
		int min;
		if (m < n && m < o)
		{
			min = m;
		}
		else if (n < o && n < m)
		{
			min = n;
		}
		else
		{
			 min = o;
		}
		
		System.out.println("min value among " + m +  " , " + n + " and " + o + " is " + min);
	}
}
