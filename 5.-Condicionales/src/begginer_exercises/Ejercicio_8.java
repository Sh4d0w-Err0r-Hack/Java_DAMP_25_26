package begginer_exercises;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_8									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	  *
		 * -> Realiza un programa que pida al usuario 5 numeros				  *
		 * 																	  *
		 * -> Muestra por pantalla cantidad de los numeros                    *
		 -------------------------------------------------------------------- */
		
		//Usamos Scanner para interactuar con datos del Usuario
				Scanner s=new Scanner(System.in);
				int contador_neg=0,contador_bajos=0,contador_med=0,contador_grand=0;
				for(int i=0;i<5;i++) {
					System.out.println("Introduce un numero");
					int num=s.nextInt();
					if(num<0) {
						contador_neg++;
					}else if(num>=0&&num<=25) {
						contador_bajos++;
					}else if(num>25&&num<=250) {
						contador_med++;
					}else if(num>250) {
						contador_grand++;
					}
				}
				System.out.println("Suma de numeros negativos: "+contador_neg);
				System.out.println("Suma de numeros bajos: "+contador_bajos);
				System.out.println("Suma de numeros medios: "+contador_med);
				System.out.println("Suma de numeros grandes: "+contador_grand);
				//Cerramos el Scanner
				s.close();
	}

}
