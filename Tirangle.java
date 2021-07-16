
public class Tirangle {

	public String trian(int a, int b, int c)
	{
		String s = "";
		if(a==b && a==c)
		{
			s =  "Equalateral";
		}
		if(a == b && a != c || a == c && a != b )
		{
			s =  "Isosles";
		}
		if(a != b && a!=c)
		{
			s =  "Scaleon";
		}
		return s;
	}
	
	public static void main(String[] args) {
		
Tirangle t = new Tirangle();
 System.out.println(t.trian(12, 12, 12));
	}

}
