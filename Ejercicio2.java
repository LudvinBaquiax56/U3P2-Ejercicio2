import java.util.*;

public class Ejercicio2 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		do {
			System.out.println("Ingrese un numero para obtener los numeros anteriores a este");
			numero1 = scanner.nextInt();
		} while (numero1<1);
		System.out.println(" ");
		for (int i = numero1; i > 0 ; i--) {
			System.out.println(i);
		}
	}

}

