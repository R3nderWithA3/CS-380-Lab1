package lab1package;

import java.util.*;

public class CS380Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		String numIn = input.next();
		String numOut = "";
		for(int i= (numIn.length()-1); i>=0; i--){
		   numOut += numIn.charAt(i);
		}
		System.out.print("Reverse: "+numOut);
	}
}