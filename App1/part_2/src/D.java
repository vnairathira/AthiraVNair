class D
{
	public static void main(String[] args) 
	{
		int i=0;
		int j= ++i + i + ++i + i;
		// j= 1 + 1 +2 +2 = 6
		i=0;
		int k= ++i + i + i++ + i; // i=2, j=6, k= 5
		//  k= 1 +1+ 1+2 =5
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}
}
