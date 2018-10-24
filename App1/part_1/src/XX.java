class XX 
{
	public static void main(String[] args) 
	{
		int i=-2;
		int j=--i + i++ + i;
		//  j=   -3 + -3 +-2 =-8 & i=-2
		System.out.println(i);
		System.out.println(j);
	}
}
