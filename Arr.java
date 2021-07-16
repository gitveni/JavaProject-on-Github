import java.util.Arrays;
import java.util.Scanner;

public class Arr {
	public int[] twodarr()
	{
		int[] two = {8,2,7};
	
		
	    int big = 0;
	    for(int i=0;i<two.length-1;i++)
	    {
	    	if(two[i]>big)
	    	{
	    		big = two[i];
	    		//System.out.println(two[i]+" is greater");
	    	}
	    	
	    }
	    System.out.println("Big is "+big);
	    for(int i=0;i<two.length;i++)
	    {
	    	//System.out.println(Arrays.toString(two));
	    	System.out.println(two[i]);
	    
	    	if(two[i] == big)
	    	{
	    		two[i]=0;
	    	}
	    	
	    	//
	    }
	    System.out.println(Arrays.toString(two));
	    for(int i=0;i<two.length;i++)
	    	
	    {
	    	System.out.println(two[i]);
	    }
	    return two;
	}
	
	public void times(int n[], int n1)
	{
		//int n1 = 45;
		int temp =0;
		int even = 0;
		int odd = 0;
		for(int i=0;i<n.length-1;i++)
		{
			for(int j=i+1;j<n.length;j++)
			{
		if(n[i] > n[j] )
			n[i] = n[i];
		else
		{
			temp = n[i];
			n[i] = n[j];
			n[j] = temp;
			
			
			}
			         
		}
		
		}
		
		for(int i=0;i<n.length;i++) {
			//n[n.length-1] = 
			System.out.println(n[i]);
			
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
System.out.println("Enter the array length");
Scanner s = new Scanner(System.in);
int n =  s.nextInt();
System.out.println("Enter the  array value one by one for its length");
Scanner s1 = new Scanner(System.in);
int[] n1 = new int[n];
for(int i = 0;i<n; i++)
	
{
	 n1[i] =  s1.nextInt();
}
Arr a = new Arr();
a.times(n1,2);

	}

}
