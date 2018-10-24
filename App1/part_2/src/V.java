class V
{
	public static void main(String[] args) 
	{
		if (true)
			//if(else) else cannot use without if
		{
	      System.out.println("fromif");
		}
			System.out.println("fromif"); // complile time error
		else
			{
		System.out.println("fro else");
	        }
		System.out.println("mainend");
	}
}
