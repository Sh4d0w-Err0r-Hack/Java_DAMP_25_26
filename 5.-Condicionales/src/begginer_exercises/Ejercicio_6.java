package begginer_exercises;
import java.util.*;
public class Ejercicio_6 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_6									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	*
		 * -> Realiza un programa que pida al usuario 1 numero				*
		 * 																	*
		 * -> Muestra por pantalla si es par o impar                        *
		 -------------------------------------------------------------------- */

		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numUsuario=s.nextInt();
		if(numUsuario%2==0) {
			System.out.println("El numero es PAR");
		}else {
			System.out.println("El numero es IMPAR");
		}
		//Cerramos el Scanner
		s.close();
	}

}
