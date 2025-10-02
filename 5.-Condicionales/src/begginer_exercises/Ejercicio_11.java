package begginer_exercises;
import java.util.*;

public class Ejercicio_11 {

	public static void main(String[] args) {
		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_11								|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	  *
		 * -> Realiza un programa que tenga las siguientes opciones			  *
		 * 																	  *
		 * -> calculo de hipotenusa, superficie circunferencia, perimetro circ*
		 * 	  area rectangulo y area triangulo                                *
		 -------------------------------------------------------------------- */
		
		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		mostarOpciones();
		int opcion=s.nextInt();
		int radio;
		double PI=Math.PI;
		switch(opcion) {
		case 1:
			System.out.println("Introduce un cateteo");
			int cateto1=s.nextInt();
			System.out.println("Introduce otro cateteo");
			int cateto2=s.nextInt();
			double hipotenusa=(Math.pow(cateto1, 2))+(Math.pow(cateto2, 2));
			System.out.println("Hipotenusa: "+hipotenusa);
			break;
		case 2:
			System.out.println("Introduzca el radio");
			radio=s.nextInt();
			double superficie_circ=PI*(Math.pow(radio, 2));
			System.out.println("Superficie: "+superficie_circ);
			break;
		case 3:
			System.out.println("Introduzca el radio");
			radio=s.nextInt();
			double longitud=2*PI*radio;
			System.out.println("Longitud: "+longitud);
			break;
		case 4:
			System.out.println("Introduce base");
			int base_cua=s.nextInt();
			System.out.println("Introduce altura");
			int altura_cua=s.nextInt();
			double area_cua=base_cua*altura_cua;
			System.out.println("Area: "+area_cua);
			break;
		case 5:
			System.out.println("Introduce base");
			int base_Tri=s.nextInt();
			System.out.println("Introduce altura");
			int altura_Tri=s.nextInt();
			double area_Tri=(base_Tri*altura_Tri)/2;
			System.out.println("Area: "+area_Tri);
			break;
		default:
			System.out.println("Opcion no valida");
		}
		s.close();
	}

	private static void mostarOpciones() {
		System.out.println("1.- Calculo de Hipotenusa");
		System.out.println("2.- Superficie circunferencia");
		System.out.println("3.- Perimetro circunferencia");
		System.out.println("4.- Area recatangulo");
		System.out.println("5.- Area triangulo");
		
	}

}
