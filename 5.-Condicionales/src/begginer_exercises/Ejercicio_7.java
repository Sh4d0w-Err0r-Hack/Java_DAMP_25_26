package begginer_exercises;
import java.util.*;
public class Ejercicio_7 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_7									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	  *
		 * -> Realiza un programa que pida al usuario 5 numeros				  *
		 * 																	  *
		 * -> Muestra por pantalla suma de los numeros clasificados por tamaño*
		 -------------------------------------------------------------------- */
		
		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		int suma_neg=0,suma_bajos=0,suma_med=0,suma_grand=0;
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un numero");
			int num=s.nextInt();
			if(num<0) {
				suma_neg+=num;
			}else if(num>=0&&num<=25) {
				suma_bajos+=num;
			}else if(num>25&&num<=250) {
				suma_med+=num;
			}else if(num>250) {
				suma_grand+=num;
			}
		}
		System.out.println("Suma de numeros negativos: "+suma_neg);
		System.out.println("Suma de numeros bajos: "+suma_bajos);
		System.out.println("Suma de numeros medios: "+suma_med);
		System.out.println("Suma de numeros grandes: "+suma_grand);
		//Cerramos el Scanner
		s.close();
	}

}
