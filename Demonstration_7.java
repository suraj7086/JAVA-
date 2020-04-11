import java.io.*;

class Array{
	public static void main(String args[]) throws IOException{
		Float principal = new Float(0);
		Float rate = new Float(0);
		int time = 5;
		DataInputStream input = new DataInputStream(System.in);
		String tempString;
		System.out.println("Enter the Principle Amount");
		System.out.flush();
		tempString = input.readLine();
		principal = Float.valueOf(tempString);
		System.out.println("Enter the rate of Interest");
		System.out.flush();
		tempString = input.readLine();
		rate = Float.valueOf(tempString);

		Float Interest = new Float(0);
		Interest = (principal*rate*time)/100;
		System.out.println("Interest is : " + Interest);
	}
}

