
public class Marks {

	public String grade(int p, int m,int s, int c)
	{
		String s1 = "";
		int n = (p+m+s+c)/4;
		if (n>= 90)
			return "Grade A";
		else if(n>=80 && n<90)
			return "Grade B";
		else if(n>=70 && n<80)
		    return "Grade C";
		else if(n>=60 && n<70)
			return "Grade D";
		else if(n>=40 && n<60)
			return "Grade E";
		else
			return "Grade F";
}
	public static void main(String[] args) {
       Marks m = new Marks();
       System.out.println(m.grade(6, 6, 65, 6));
	}

}
