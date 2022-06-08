package medidorFelicitat;
import java.util.Scanner;

public class MedidorFelicitat {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.println("Introdueix la felicitat del primer dia:");
		int A = escaner.nextInt();
		
		System.out.println("Introdueix la felicitat del segon dia:");
		int B = escaner.nextInt();
		
		System.out.println("Introdueix la felicitat del tercer dia:");
		int C = escaner.nextInt();
		
		
		if(A < B) {
			if (B < C) {
				System.out.println("SI");
			} else { 
				System.out.println("NO");
			}
			
		} else { 
			System.out.println("NO");
		}
	}

}
