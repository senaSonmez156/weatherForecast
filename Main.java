package etkinlikOnerme;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	int heat;
	Scanner input =new Scanner(System.in);
	System.out.print("Bir hava s�cakl��� giriniz: ");
	heat=input.nextInt();
	
	if(heat<5) {
		System.out.print("Hava da epey so�ukmu�. Kayak yapabilirsiniz. :)");
	}
	else if(heat<=25) {
		if(heat<=15) {
			System.out.print("Duydu�uma g�re vizyonda yeni filmler gelmi�. Sinemaya gitmeye ne dersin? ");
		}
		
		if(heat>=10) {
			System.out.print("Bence lezzetli at��t�rmal�klar�n� haz�rla ve hemen pikni�e git! :)");
		}
		else {
			System.out.print("Ne bekliyorsun? Hadi y�zmeye gidelim");
		}
	}

	}

}
