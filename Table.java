
public class Table {
	public void mul(int a)
	{
		for(int i=0; i<10; i++)
		{
			if((i*a)%3==0||(i*a)%5==0||(i*a)%7==0 )
			{
				
			}
			else
			System.out.println( i+" * "+a+" = "+i*a);
		}
		
	}
	public static void main(String[] args) {
		Table t = new Table();
		t.mul(4);
	}

}
