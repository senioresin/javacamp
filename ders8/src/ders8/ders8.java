package ders8;

import java.util.Scanner;

public class ders8 {
	
	public static void main(String[]args) {
		
		String sys_kul_adı = "yazilim bilimi";
		String parola = "12345";
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("kullanıcı adı:");
			
			String kullanıcı_adı = scan.nextLine();
			System.out.println("parola:");
			
			String kul_parola = scan.nextLine();
			
			if ( !(sys_kul_adı.equals(kullanıcı_adı)) && !(parola.equals(kul_parola))) {
			System.out.println("parola yanlış");
				
			}
			
			else if (!(sys_kul_adı.equals(kullanıcı_adı)) && !(parola.equals(kul_parola))) {
  System.out.println("kullanıcı adı yanlış");
			}
			else if (!(sys_kul_adı.equals(kullanıcı_adı)) && (parola.equals(kul_parola))) {
   System.out.println("kullanıcı adı yanlış parola yanlış");
			}
				  
				  
				  else {
				  
					  System.out.println("tamamdır");
				  }
		}
			  }
	}

