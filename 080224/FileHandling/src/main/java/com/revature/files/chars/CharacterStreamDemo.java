package com.revature.files.chars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
public static void main(String[] args) {
	FileReader inputReader=null;
	FileWriter outputWriter=null;
	
	try {
		inputReader=new FileReader("C:\\filehandling\\myfile.jpg");
		outputWriter=new FileWriter("C:\\filehandling\\myfileChars.jpg");
		int c;
		while((c=inputReader.read())!=-1)
			outputWriter.write(c);
			//System.out.println(c);
			
		outputWriter.flush();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
