class Zd 
{
	public static void main(String[] args) 
	{
		if(false)
			{
		System.out.println("from if");
			}
			else if(false)
		{
				System.out.println("inner if1");
		}
		else if(false)
		{
			System.out.println("inner if2");
		}
		else
		{
			System.out.println("else");
		}
		else if(true)
		{
			System.out.println("last blk");
		}

		System.out.println("end of main");
	}
}
