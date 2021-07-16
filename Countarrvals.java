import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Countarrvals {
	int count = 1;
	
	public void count(ArrayList<String> fruits)
	{
		Set<String> set = new HashSet<>();
		
		for(int i=0;i<fruits.size()-1;i++)
		{
			for(int j=i+1;j<fruits.size();j++)
			{
				
				if(fruits[i]))
				{
					
				}
		}
		//System.out.println(s+" "+count);
		}
		
	}

	public static void main(String[] args) {
		Countarrvals c = new Countarrvals();
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("apple");
		c.count(fruits);
		//System.out.println();
		

	}

}
