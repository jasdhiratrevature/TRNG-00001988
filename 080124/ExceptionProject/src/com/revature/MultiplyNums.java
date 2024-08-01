package com.revature;

public class MultiplyNums {
public static void main(String[] args) {
	int inputNum=1;
	try {
		inputNum=Integer.parseInt(args[0]);
	} /*
		 * catch(ArrayIndexOutOfBoundsException |NumberFormatException e) {
		 * e.printStackTrace(); }
		 */
	finally {
		// clean your objects here
		System.out.println("Finally Block");
	}
	/*catch(NumberFormatException e) {
		e.printStackTrace();
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}*/
	int result=17*inputNum;
	System.out.println("Result = "+result);
}
}
