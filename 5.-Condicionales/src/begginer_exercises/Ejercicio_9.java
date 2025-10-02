package begginer_exercises;
import java.util.*;

public class Ejercicio_9 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_9									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	  *
		 * -> Realiza un programa que pida al usuario 1 nota			      *
		 * 																	  *
		 * -> Muestra por pantalla deficiente,sufi,bien,notable y sobresaliente*
		 -------------------------------------------------------------------- */
		
		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		System.out.println("Introduce una nota");
		int nota=s.nextInt();
		switch(nota) {
		case 0,1,2:
			System.out.println("Muy Deficiente");
		break;
		case 3,4:
			System.out.println("Deficiente");
		break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7,8:
			System.out.println("Notable");
		break;
		case 9,10:
			System.out.println("Sobresaliente");
		break;
		default:
			System.out.println("Nota incorrecta, debe ser entre 0 y 10");
		}
		//Cerramos el Scanner
		s.close();
	}

}
