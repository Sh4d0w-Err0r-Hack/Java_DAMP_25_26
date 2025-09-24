package ecuaciones_segundo_grado;
import java.util.*;
public class Ecuaciones_Segundo_Grado {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						    Ejercicio								|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	*
		 * -> Realiza un programa que calcule la ecuacion de segundo grado	*
		 * 																	*
		 -------------------------------------------------------------------- */
		
		//Formula General de ec. Segundo Grado
		System.out.println("Formula: ax²+bx+c=0");
		//Usamos Scanner para usar datos del Usuario
		Scanner s=new Scanner(System.in);
		//Pedimos que introduzca el valor de a,b y c
		System.out.println("Introduce el valor de 'a': ");
		int a=s.nextInt();
		System.out.println("Introduce el valor de 'b': ");
		int b=s.nextInt();
		System.out.println("Introduce el valor de 'c': ");
		int c=s.nextInt();
		
		//Aplicamos la formula de resolucion, separando las partes de la division
		double parte_arriba_div_Positiva=(-b+(Math.sqrt(Math.pow(b,2)-4*a*c)));
		
		double parte_arriba_div_Negativa=(-b-(Math.sqrt(Math.pow(b,2)-4*a*c)));
		
		double parte_abajo_div=(2*a);
		
		double solucion_1=(parte_arriba_div_Positiva/parte_abajo_div);
		
		double solucion_2=(parte_arriba_div_Negativa/parte_abajo_div);
		
		System.out.println("X1: "+solucion_1);
		System.out.println("X2: "+solucion_2);
		
		//Cerramos el Scanner
		s.close();
	}

}
