import java.util.Arrays;

public class Stringman {
	public void uplow()
	{
		String s = "Hello world how are you?";
		String st[] = s.split(" ");
		System.out.println("Hello world".lastIndexOf("l"));
		
		for(int i = 0; i<st.length; i++)
		{
			if(i%2==0) 
			
			System.out.print(st[i].toUpperCase() + " ");
			else
				System.out.print(st[i].toLowerCase()+ " ");
		}
	}
	
	public void cont(String s1, String s2)
	{
		String[] srr = s1.split(" ");
		int count = 0;
		for(int i = 0; i<srr.length; i++)
		{
			if(srr[i].contains(s2))
			{
				count = count + 1;
			}
			
		}
		
		System.out.println(s2+" exist" + count + " times");	
		
		
	}
public boolean comp(String s1, String s2)
{
	if(s1.trim().equalsIgnoreCase(s2.trim()))
		return true;
	else 
		return false;
}
public void rev(String s)
{
	String s1 = "";
	for(int i=s.length()-1; i>=0;i--) {
		//System.out.println(s.charAt(i));
		s1 = s1+s.charAt(i);
		
		}
	System.out.println(s1);
}
public void con(String s1, String s2)
{
	System.out.println(s1.concat(s2).length());
}
public void dup(String s1) {
	String[] sarr = s1.split(" ");
	System.out.println(sarr.length);
	int count = 0;
	for(int i=0;i<sarr.length-1;i++)
	{
	for(int j=i+1;j<sarr.length;j++)
	{
		//System.out.println(sarr[i]+ " "+ sarr[j]);
		
		if(sarr[i].equalsIgnoreCase(sarr[j]))
		{
			count = count+1;
			System.out.println(sarr[i]+ " occurs "+ count + " times");
		}
		count = 1;
	}}
	
}
public void remove(String s1)
{
	//System.out.println(s1.trim().replaceAll("\\s+", ""));
	System.out.println(s1.trim().length());
	System.out.println(s1.trim().replaceAll("\\s+", "").length());
	//String s3 = s2.replaceAll("\\s+", "");
	//System.out.println(s2.length());
}
	public static void main(String[] args) {
		Stringman s = new Stringman();
		//s.uplow();
//		System.out.println(s.comp("hello   ", "Hello	"));
//		s.rev("mount");
//		s.con("very", "good");
		//s.dup("Hello there how are there how");
		s.remove(" hello there hoe     ");
		

	}

}
