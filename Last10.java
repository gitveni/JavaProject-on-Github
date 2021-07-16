
public class Last10 {

	public void comp(String s1, String s2)
	{
		String s3 = "";
		String s4 = "";
		int count = 0;
		{
		for(int i=s1.length()-1; i>=10; i--)
		{
              s3 = s3+s1.charAt(i);
              System.out.println(i);
              count = count+1;
              if  (count==10)
            	  break;

		}
		count = 0;
		System.out.println("s3 val "+s3);
		for(int i=s2.length()-1; i>=10; i--)
		{
              s4 = s4+s2.charAt(i);
              count = count+1;
              if  (count==10)
            	  break;
		}
		 System.out.println("s4 val "+s4);
		if(s3.equals(s4))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		}
		
		}
	public void comp1(String s1, String s2)
	{
		String s3  = "";
		String s4  = ""; 
		if(s1.length()>2 && s2.length()>2)
		{
			for(int i=0;i<3;i++)
			{
				s3  = s3+s1.charAt(i);
			}
			for(int i=0;i<3;i++)
			{
				s4  = s4+s2.charAt(i);
			}
			if(s3.equals(s4)) {
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal");
			}
		}
	}
	
	public static void main(String[] args) {
		 Last10 l = new  Last10();
		 l.comp("Hello there how are you?", "Hello there how are you?");

	}

}
