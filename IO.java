package OOPS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s=br.readLine();
			double num=Double.parseDouble(s);
			System.out.println("Number is:"+num);
			
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}

	}

}

