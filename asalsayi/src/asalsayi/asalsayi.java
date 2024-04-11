package asalsayi;

import java.util.Scanner; 

public class asalsayi {

	public static void main(String[] args) {
	

		Scanner input = new Scanner(System.in);
		
		boolean asalmi=false;
		
		int a = 3;
		while (a ==3) {
		System.out.print("Sayıyı giriniz :");
		int sayi = input.nextInt();
		if(sayi == 2) {
			System.out.println("Girdiğiniz 2 sayısı asaldır.");
			 continue;
		}
		 
		if(sayi < 2){
			 asalmi=false;
		}
		
		else {
			for(int i = 2; i < sayi ; i++) {
				int kalan = sayi % i;
				if(kalan == 0) {
					 asalmi=false;
					 break;
				}
				 
				else {
			 asalmi=true;
			 continue;
				}
			}
		}
		if(asalmi) {
			System.out.println("Girdiğiniz " + sayi + " sayısı asaldır.");
		}
		else {
			System.out.println("Girdiğiniz " + sayi + " sayısı asal değildir.");
		}
		}
	}

}
