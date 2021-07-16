
public class Starrect {
	public void rect()
	{
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				if(i == 0 || i == 5)
				System.out.print("*");
				else if( j==0 ||  j==5)
				{
					System.out.print("*");
					//System.out.print(i+","+j);
					
				}
				else {
					System.out.print(" ");
				}
				
			
			}
			System.out.println();
		}
			
		}
	

	public static void main(String[] args) {
		
		Starrect s = new Starrect();
		s.rect();
	}

}
