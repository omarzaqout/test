package testcrc;

import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		sendwithouterror sd =new sendwithouterror();
		sendwitherror sed=new sendwitherror();
		System.out.println("Enter Data:");
		String data=scan.next();
		
		System.out.println("Enter Pattern");
		String pattern=scan.next();
		
		System.out.println("Send without Error");
		System.out.println("Send with Error");
		System.out.println("to exit app");
		while(true) {
		int n=scan.nextInt();
		switch(n) {
		case 1:sd.withouterror(data, pattern);
			break;
		case 2:sed.sendwitherror(data, pattern);;
			break;
		case 3:return ;
		
		default: System.out.println("re enter");
		break;
		
		}
		System.out.println("1- Send without Error");
		System.out.println("2- Send with Error");
		System.out.println("3- to exit app");
		}
		

	}

}
