class C 
{
	public static void main(String[] args) 
	{
		int i = 45;
		String s1 = "101101";
		System.out.println("Binary representation of " + i + " is " + Integer.toBinaryString(i));
		System.out.println("Decimal representation of " + s1 + " is " + Integer.parseInt("101101",2));
	}
}
