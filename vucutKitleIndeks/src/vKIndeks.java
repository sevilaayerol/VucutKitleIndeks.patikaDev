import java.util.Scanner;

public class vKIndeks {

	public static void main(String[] args) {
		double boy, kilo, indeks;
		
		Scanner input= new Scanner(System.in);
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		boy=input.nextDouble();
		
		System.out.print("L�tfen kilonuzu giriniz : ");
		kilo=input.nextDouble();
		
		indeks= kilo/(boy*boy);
		
		System.out.print("V�cut Kitle �ndeksiniz : ");
		System.out.println(indeks);
		
	}

}
