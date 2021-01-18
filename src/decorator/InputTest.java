package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/prashantsingh/eclipse-workspace/HeadFirstDesignPattern/src/decorator/test.txt")));
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			
			in.close();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}