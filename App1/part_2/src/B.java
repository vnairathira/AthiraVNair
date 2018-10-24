class C
{
	public static void main(String[] args) 
	{
		int i=0;
		int j= --i + i + --i + i + --i + i;
		//  j= -1 + -1  +-2 + -2 + -3+ -3 =-12 $ i=-3;
		System.out.println(i);
		System.out.println(j);

	}
}
