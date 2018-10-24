class Ze
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
		else if(true)// else if(false)
		{
			System.out.println("last blk");
		}
		else
		{
			System.out.println("else");
		}

		System.out.println("end of main");
	}
}
