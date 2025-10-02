package begginer_exercises;
import java.util.*;
public class Ejercicio_12 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_12								|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	  *
		 * -> Realiza un programa que devuelva el cambio de una compra		  *
		 * 																	  *
		 -------------------------------------------------------------------- */
		
		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		System.out.println("Total de la compra");
		int precio=s.nextInt();
		System.out.println("Dinero para pagar");
		int total=s.nextInt();
		int contador_100=0,contador_50=0,contador_25=0,contador_5=0,contador_1=0;
		if(total<precio) {
			System.out.println("Falta dinero");
		}else {
			System.out.println("Precio a devolver: "+(total-precio));
			int restante=(total-precio);
			while(restante>0) {
				if(restante%100==0) {
					restante=restante-100;
					contador_100++;
				}else if(restante%50==0) {
					restante=restante-50;
					contador_50++;
				}else if(restante%25==0) {
					restante=restante-25;
					contador_25++;
				}else if(restante%5==0) {
					restante=restante-5;
					contador_5++;
				}else if(restante%1==0) {
					restante=restante-1;
					contador_1++;
				}
			}
			System.out.println("Monedas de 100: "+contador_100);
			System.out.println("Monedas de 50: "+contador_50);
			System.out.println("Monedas de 25: "+contador_25);
			System.out.println("Monedas de 5: "+contador_5);
			System.out.println("Monedas de 1: "+contador_1);
			s.close();
		}
	}

}
