package weather_forecast;

import java.util.*;

public class Weather_Forecast {


	public static void main(String[] args) {

		/*
		  ------------------------------------------------------------------
		 | 																	|
		 | 						Ejercicio_1									|
		 | 																	|
		  ------------------------------------------------------------------
		 *																	*
		 * -> Realiza un programa que muestre la temperatura de cordoba		*
		 * 																	*
		 * -> Maximas y minimas temperaturas de cada estacion				*
		 * 																	*
		 * -> Generar maximo, minimo y si esta soleado o nublado			*
		 * 																	*
		 * -> Recibir del usuario una estacion del año						*
		 * 																	*
		 -------------------------------------------------------------------- */
		
		//Iniciamos el Scanner para poder interactuar con datos del usuario
		Scanner s=new Scanner(System.in);
		//Generamos un numero aleatorio entre 1 y 10 para trabajar despues
		int sunny_claude=(int)(Math.round(Math.random()*(10-1)+1));

		String weather;

		
		//Maximos y minimos de cada estacion
		int temp_spring_max=39;
		int temp_spring_min=10;

		int temp_summer_max=45;
		int temp_summer_min=20;

		int temp_autumn_max=33;
		int temp_autumn_min=5;

		int temp_winter_max=28;
		int temp_winter_min=1;

		mostrarOpciones();

		int opcion=s.nextInt();

		System.out.println("-------------------Weather forecast--------------------");

		switch(opcion) {

		case 1:

			System.out.println("=========Spring=======");

			int temp_media_max_spring=(int)(Math.round(Math.random()*(temp_spring_max-temp_spring_min)+temp_spring_min));

			int temp_media_min_spring=(int)(Math.round(Math.random()*(temp_spring_max-temp_spring_min)+temp_spring_min));
			// En caso de que la temperatura maxima sea menor a la minima, cambio de valor
			if(temp_media_min_spring>temp_media_max_spring) {

				int aux=temp_media_max_spring;

				temp_media_max_spring=temp_media_min_spring;

				temp_media_min_spring=aux;

			}
			//usamos el numero generado al principio para usarlo en probabilidades
			if(sunny_claude>=4) {

				weather="Sunny";

			}else {

				weather="Cloudy";

			}

			System.out.println("Minimum Tº: "+temp_media_min_spring+"ºC");

			System.out.println("maximum Tº: "+temp_media_max_spring+"ºC");

			System.out.println("Weather: "+weather);

			break;

		case 2:

			System.out.println("=========Summer=======");

			int temp_media_max_summer=(int)(Math.round(Math.random()*(temp_summer_max-temp_summer_min)+temp_summer_min));

			int temp_media_min_summer=(int)(Math.round(Math.random()*(temp_summer_max-temp_summer_min)+temp_summer_min));

			if(temp_media_min_summer>temp_media_max_summer) {

				int aux=temp_media_max_summer;

				temp_media_max_summer=temp_media_min_summer;

				temp_media_min_summer=aux;

			}

			if(sunny_claude>=1) {

				weather="Sunny";

			}else {

				weather="Cloudy";

			}

			System.out.println("Minimum Tº: "+temp_media_min_summer+"ºC");

			System.out.println("maximum Tº: "+temp_media_max_summer+"ºC");

			System.out.println("Weather: "+weather);

			break;

		case 3:

			System.out.println("=========Autumn=======");

			int temp_media_max_autumn=(int)(Math.round(Math.random()*(temp_autumn_max-temp_autumn_min)+temp_autumn_min));

			int temp_media_min_autumn=(int)(Math.round(Math.random()*(temp_autumn_max-temp_autumn_min)+temp_autumn_min));

			if(temp_media_min_autumn>temp_media_max_autumn) {

				int aux=temp_media_max_autumn;

				temp_media_max_autumn=temp_media_min_autumn;

				temp_media_min_autumn=aux;

			}

			if(sunny_claude>=5) {

				weather="Sunny";

			}else {

				weather="Cloudy";

			}

			System.out.println("Minimum Tº: "+temp_media_min_autumn+"ºC");

			System.out.println("maximum Tº: "+temp_media_max_autumn+"ºC");

			System.out.println("Weather: "+weather);

			break;

		case 4:

			System.out.println("=========Winter=======");

			int temp_media_max_winter=(int)(Math.round(Math.random()*(temp_winter_max-temp_winter_min)+temp_winter_min));

			int temp_media_min_winter=(int)(Math.round(Math.random()*(temp_winter_max-temp_winter_min)+temp_winter_min));

			if(temp_media_min_winter>temp_media_max_winter) {

				int aux=temp_media_max_winter;

				temp_media_max_winter=temp_media_min_winter;

				temp_media_min_winter=aux;

			}

			if(sunny_claude>=4) {

				weather="Sunny";

			}else {

				weather="Cloudy";

			}

			System.out.println("Minimum Tº: "+temp_media_min_winter+"ºC");

			System.out.println("maximum Tº: "+temp_media_max_winter+"ºC");

			System.out.println("Weather: "+weather);

			break;

		}
		s.close();
	}

	

	public static void mostrarOpciones() {

		System.out.println("1.- Spring");

		System.out.println("2.- Summer");

		System.out.println("3.- Autumn");

		System.out.println("4.- Winter");

		

	}


}