package begginer_exercises;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_4									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	*
		 * -> Realiza un programa que pida al usuario 5 numeros				*
		 * 																	*
		 * -> Muestra por pantalla el menor                                 *
		 -------------------------------------------------------------------- */
		
		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		
		int min=Integer.MAX_VALUE;
		//bucle para guardar el numero mayor
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un numero");
			int numUsuario=s.nextInt();
			if(numUsuario<min) {
				min=numUsuario;
			}
		}
		System.out.println("El numero menor es: "+min);
		//Cerramos el Scanner
		s.close();

	}

}
