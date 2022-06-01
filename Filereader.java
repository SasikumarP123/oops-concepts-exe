package OOPS;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Filereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader reader=new FileReader("/home/zohotest2/Desktop/Untitled Document 1");
		try {
			System.out.println("Data read from a file...");
			int i;
			while((i=reader.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			reader.close();
		}

	}

}
