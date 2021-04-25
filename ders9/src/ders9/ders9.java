package ders9;

import java.util.Scanner;

public class ders9 {
	
	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int sayi = scan.nextInt();
		
	switch(sayi) {
	case 1: 
		System.out.println("bir");
	    break;
	
	case 2:
	System.out.println("iki");
	break;
	
	case 3:
	System.out.println("üç");
	break;
	
	case 4:
		System.out.println("dört");
		break;
		default:
			System.out.println("geçersiz sayı");
			break;
			
	}
	}

		
}

