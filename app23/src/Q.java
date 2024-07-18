class Q 
{
	int i;
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		Q q2 = q1;
		Q q3 = q2;
		Q q4 = q1;
		Q q5 = q3;
	    System.out.println(q1.i);
		System.out.println(q2.i);
		System.out.println(q3.i);
		System.out.println(q4.i);
		System.out.println(q5.i);

		q4.i = 20; 
		System.out.println(q1.i);
		System.out.println(q2.i);
		System.out.println(q3.i);
		System.out.println(q4.i);
		System.out.println(q5.i);
		q2.i += 40; 
		System.out.println(q1.i);
		System.out.println(q2.i);
		System.out.println(q3.i);
		System.out.println(q4.i);
		System.out.println(q5.i);
	}
}
