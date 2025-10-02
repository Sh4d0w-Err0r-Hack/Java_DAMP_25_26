package cinema;
import java.time.*;
import java.util.*;
public class Cinema {

	public static void main(String[] args) {
		/**/
		
		//Usamos Scanner para interactuar con datos del Usuario
		Scanner s=new Scanner(System.in);
		double base_price=8;
		LocalDateTime dia_Semana_actual=LocalDateTime.now();
		DayOfWeek dia_semana=dia_Semana_actual.getDayOfWeek();
		String dia=String.valueOf(dia_semana);
		System.out.println(dia);
		System.out.println("¿cuantas personas sois?");
		int personas=s.nextInt();
		System.out.println("¿Teneis carnet? (1-Si/2.-No)");
		int carnet_num=s.nextInt();
		boolean carnet;
		if(carnet_num==1) {
			carnet=true;
			base_price=base_price-(base_price*0.1);
		}else {
			carnet=false;
		}
		System.out.println("Precio por persona: "+base_price);
		double precio_final;
		switch(dia) {
		case "MONDAY","THURSDAY","FRIDAY":
			base_price=8;
			if(carnet) {
				base_price=base_price-(base_price*0.1);
			}
			precio_final=base_price*personas;
			System.out.println("Total a pagar: "+precio_final);
			break;
		case "WEDNESDAY":
			base_price=5;
			if(carnet) {
				base_price=base_price-(base_price*0.1);
			}
			precio_final=base_price*personas;
			System.out.println("Total a Pagar: "+precio_final);
			break;
		case "TUESDAY":
			System.out.println("¿Sois parejas?");
			boolean pareja=s.nextBoolean();
			if(pareja) {
				int parejas=personas/2;
				base_price=11;
				if(carnet) {
					base_price=base_price-(base_price*0.1);
				}
				precio_final=base_price*parejas;
				System.out.println("Total a pagar: "+precio_final);
			}else {
				base_price=8;
				if(carnet) {
					base_price=base_price-(base_price *0.1);
				}
				precio_final=base_price*personas;
				System.out.println("Total a pagar: "+precio_final);
			}
			break;
		default:
			System.out.println("Hoy el cine está cerrado, disculpen las molestias...");
		}
		s.close();
	}

}
