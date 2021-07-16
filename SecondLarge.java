import java.util.Scanner;

public class SecondLarge {
	public void secbig(int[] arr)
	{
		int big = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(big<arr[i])
			{
				big = arr[i];
			}
		}
		System.out.println(big);
	}

	public static void main(String[] args) {
		Arr a = new Arr();
		SecondLarge sl = new SecondLarge();
		//Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value for n ");
//		int n = a.twodarr().length;
//		System.out.println("The array value "+a.twodarr());
//		int[] arr = new int[n];
//		
//		System.out.println("Input the array val  ");
//		for(int i=0;i<n;i++)
//		{
//			arr[i] = s.nextInt();
//		}
		sl.secbig(a.twodarr());

	}

}
