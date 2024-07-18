class F 
{
	public static void main(String[] args) 
	{
		int i = 23;
		int j= i++;
		System.out.println(i);//24
		System.out.println(j);//23
		System.out.println(i == j);//false
		System.out.println(i != j);//true
		System.out.println(true != false);//true
		System.out.println(i++ != j--);//true
		System.out.println(i++ != j--);//true
		System.out.println(i++ != --j);//true
	}
}
