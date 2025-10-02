package begginer_exercises;
import java.util.*;
public class Ejercicio_10 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_10									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	  *
		 * -> Realiza un programa que permita realizar estas operaciones      *
		 * 																	  *
		 * -> Raices, potencias y modulo de la division                       *
		 -------------------------------------------------------------------- */
		
		//Usamos el Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		
		mostrarOpciones();
		int opcion=s.nextInt();
		double resultado;
		switch(opcion) {
		case 1:
			System.out.println("Introduce un numero");
			int raiz=s.nextInt();
			resultado=Math.sqrt(raiz);
			System.out.println("Raiz: "+resultado);
			break;
		case 2:
			System.out.println("Introduce una base");
			int base=s.nextInt();
			System.out.println("Introduce una potencia");
			int potencia=s.nextInt();
			resultado=Math.pow(base, potencia);
			System.out.println("Potencia: "+resultado);
			break;
		case 3:
			System.out.println("Introduce el dividendo");
			int dividendo=s.nextInt();
			System.out.println("Introduce el divisor");
			int divisor=s.nextInt();
			resultado=dividendo%divisor;
			System.out.println("Modular: "+resultado);
			break;
		default:
			System.out.println("Numero no valido");
		}
		s.close();
	}

	private static void mostrarOpciones() {
		System.out.println("1.- Raiz");
		System.out.println("2.- Potencia");
		System.out.println("3.- Modulo");
		
	}

}
