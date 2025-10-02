package begginer_exercises;
import java.util.*;
public class Ejercicio_3 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_3									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	*
		 * -> Realiza un programa que pida al usuario 5 numeros				*
		 * 																	*
		 * -> Muestra por pantalla el mayor                                 *
		 -------------------------------------------------------------------- */
		
		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		
		int max=Integer.MIN_VALUE;
		//bucle para guardar el numero mayor
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un numero");
			int numUsuario=s.nextInt();
			if(numUsuario>max) {
				max=numUsuario;
			}
		}
		System.out.println("El numero mayor es: "+max);
		//Cerramos el Scanner
		s.close();
	}

}
