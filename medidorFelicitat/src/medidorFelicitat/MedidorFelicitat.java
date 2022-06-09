package medidorFelicitat;
import java.util.Scanner;

public class MedidorFelicitat {

	public static void main(String[] args) {
		
		Scanner escaner = new Scanner(System.in);
		
		//Demanem els valors a l'usuari. A és el primer dia, B el segon, i C el tercer.
		System.out.println("Introdueix la felicitat del primer dia:");
		int A = escaner.nextInt();
		
		System.out.println("Introdueix la felicitat del segon dia:");
		int B = escaner.nextInt();
		
		System.out.println("Introdueix la felicitat del tercer dia:");
		int C = escaner.nextInt();
		
		//Comprovem que els valors van en augment. Si és així, imprimim "SI" en pantalla. En cas contrari, imprimirem "NO".
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
	
	public static int getA(int A) {
		return A;
	}
	
	public static int getB(int B) {
		return B;
	}
	
	public static int getC(int C) {
		return C;
	}
	
	public static void setA(int A, int Anova) {
		
		A = Anova;
	}
	
	public static void setB(int B, int Bnova) {
		B = Bnova;
	}
	
	public static void setC(int C, int Cnova) {
		C = Cnova;
	}
	
	

}
