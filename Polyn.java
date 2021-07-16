
public class Polyn {

	public boolean polyn(String s)
	{
		int i = 0;
		int j = s.length()-1;
		
		while(i<j)
		{
			if (s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Polyn p = new Polyn();
		System.out.println(p.polyn("malayalm"));
	}

}
