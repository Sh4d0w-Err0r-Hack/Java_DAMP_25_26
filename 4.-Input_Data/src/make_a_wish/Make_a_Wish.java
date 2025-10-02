package make_a_wish;
import java.util.*;
public class Make_a_Wish {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Make a Wish									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	*
		 * -> Realiza un programa que pida al usuario 1 numero				*
		 * 																	*
		 * -> Se genera un numero aleatorio (1-10)							*
		 * 																	*
		 * -> Si el numero coincide, mostrar mensaje "pide un deseo"		*
		 * 																	*
		 -------------------------------------------------------------------- */
		
		//Metodo Scanner para trabajar con datos del Usuario
		Scanner s=new Scanner(System.in);
		
		//Pedimos al usuario que introduzca un numero
		System.out.println("Introduce un numero");
		int numeroUsuario=s.nextInt();
		
		//Generamos un numero aleatorio entre 1 y 10
		int max=10,min=0;
		int numeroAleatorio=(int)(Math.round(Math.random()*(max-min)+1));
		
		//Comparamos si ambos numeros son iguales
		if(numeroUsuario==numeroAleatorio) {
			System.out.println("Pide un Deseo");
		}else {
			System.out.println("Esta vez no ha habido suerte");
		}
		
		//Cerramos el Scanner
		s.close();
	}

}
