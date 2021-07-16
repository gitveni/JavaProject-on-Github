
public class Prime1 {
	public boolean prime(int n)
	{
		if (n<=1) {
			return false;
		}
		if(n==2 || n==3)
		{
			return true;
		}
		if(n>3)
		{
			int i = 2;
			while(i<n)
			{
				if(n%i == 0)
				
					return false;
				    i++;
					break;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
	Prime1 p = new Prime1();	
     System.out.println(p.prime(7));
	}

}
