class Zc
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		if(flag=false)
			{
		System.out.println("from if");
			}
		else if(flag=true)
			{
				System.out.println("inner if1");
			}
		else if(flag=false)
			{
			System.out.println("inner if2");
			}
		System.out.println("end of main");
		System.out.println(flag);
	}
}
