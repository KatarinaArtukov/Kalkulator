package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner= new Scanner(System.in);
		String s;
		do {
			s= scanner.nextLine();
			if(s.equals("")) {
				continue;
			}
			String[] pars= s.split(" ");
			
			if(pars.length!=3) {
				continue;
			}
		
		} while(!s.equals("kraj"));
	}

}
