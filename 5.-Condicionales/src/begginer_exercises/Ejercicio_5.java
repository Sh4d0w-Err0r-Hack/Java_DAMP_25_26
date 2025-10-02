package begginer_exercises;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_5									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	*
		 * -> Realiza un programa que pida al usuario 5 numeros				*
		 * 																	*
		 * -> Muestra por pantalla el menor y el mayor                      *
		 -------------------------------------------------------------------- */
		
		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		//bucle para guardar el numero mayor
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un numero");
			int numUsuario=s.nextInt();
			if(numUsuario<min) {
				min=numUsuario;
			}
			if(numUsuario>max) {
				max=numUsuario;
			}
		}
		System.out.println("El numero menor es: "+min);
		System.out.println("El numero mayor es: "+max);
		//Cerramos el Scanner
		s.close();
	}

}
