package com.revature.files.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
public static void main(String[] args) {
	FileInputStream input;
	FileOutputStream output;
	
	try {
		input=new FileInputStream("C:\\filehandling\\myfile.jpg");
		output=new FileOutputStream("C:\\filehandling\\myfilebyte.jpg");
		int c;
		while((c=input.read())!=-1)
			output.write(c);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
