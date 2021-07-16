
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
	public void read(int n) throws IOException {
		File f = new File("/Users/veni/Desktop/delete1.txt");
		FileReader fr =  new FileReader(f);
	BufferedReader fr2 = new BufferedReader(fr);
	String s = fr2.readLine();
	
		
	File f1 = new File("/Users/veni/Desktop/new.txt");
	FileWriter fr1  = new FileWriter(f1);
	BufferedWriter bw = new BufferedWriter(fr1);
	//BufferedReader br = new BufferedReader(fr);
	int count = 0;
	
	while(s!=null)
	{
		s = fr2.readLine();
		bw.flush();
		count = count+1;
		if(count>=5)
		{
		System.out.println("count "+count);}
		
	}
	System.out.println("count "+count);
	
}
public static void main(String[] args) throws IOException {
		ReadWrite rw = new ReadWrite();
		rw.read(5);
		
	

	}

}
