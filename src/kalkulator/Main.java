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
				if(s.equals("kraj")) {
					continue;
				}
				System.out.println("Pogresan format naredbe");
				continue;
			}
			int x= Integer.parseInt(pars[0]);
			int y= Integer.parseInt(pars[2]);
			if(pars[1].equals("+")) {
				System.out.println(x+y);
			}
		} while(!s.equals("kraj"));
	}

}
