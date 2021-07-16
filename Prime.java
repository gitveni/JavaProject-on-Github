
public class Prime {

	public boolean prime(int n) 
	{
	
		if (n==2 || n==3) 	return true;
		if (n<=1) 	return false;
		
		if(n>3)
		{
			int i = 2;
			//for(int i = 2; i<n; i++)
			while(i<n)
			{
				if (n%i == 0) return false;
				break;
			}
			
				
		}
		return true;
		}
		
	
	public static void main(String[] args) {
		Prime p = new Prime();
		System.out.println(p.prime(0));
	}

}
