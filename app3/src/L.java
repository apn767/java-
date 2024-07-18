class L 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i ++  +  i  + i ++  + i ++  + i  + i --  + i ++  + i   + i --  +  i ++  + i -- + i ++ +
			    //0     1     1      2       3     3      2       3       3       2       3      2
		        i ++  +  i  + i ++  + i ++  + i  + i --  + i ++  + i   + i --  +  i ++  + i -- + i ++ +
		     //  3     4      4     5       6     6       5      6       6       5         6    5     
		        i ++ +  i  + i ++  + i ++  + i  + i --  + i ++  + i   + i --  +  i ++  + i -- + i ++ ;
				//6    7     7      8      9      9      8       9       9      8        9     8    
		System.out.println(i);//9
		System.out.println(j);//183
	}
}
