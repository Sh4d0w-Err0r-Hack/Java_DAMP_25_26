package begginer_exercises;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_2									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	*
		 * -> Realiza un programa que pida al usuario 2 numeros				*
		 * 																	*
		 * -> Muestra por pantalla el menor									*
		 -------------------------------------------------------------------- */
		//Usamos Scanner para poder interactuar con datos del Usuario
				Scanner s=new Scanner(System.in);
				System.out.println("Introduce un numero");
				int num1=s.nextInt();
				System.out.println("Introduce otro numero");
				int num2=s.nextInt();
				
				if(num1<num2) {
					System.out.println("El numero 1 es menor que el numero 2: "+num1);
				}else if(num1>num2){
					System.out.println("El numero 2 es menor que el numero 1: "+num2);
				}else {
					System.out.println("Los numeros son iguales");
				}
				//Cerramos el Scanner
				s.close();
	}

}
