import java.util.HashMap;
import java.util.Map;

public class Mapp {
	
	public void occur(String s)
	{
		Map<Character, Integer> m = new HashMap<>();
		char[] c = s.toCharArray();
		
		for(Character c1:c)
		{
			if(m.containsKey(c1))
			{
				m.put(c1, m.get(c1) + 1 );
			}
			else
			{
				m.put(c1, 1);
			}
			
		}
		for(Map.Entry entry : m.entrySet())
		{
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		Mapp m = new Mapp();
       m.occur("hello");
	}

}
