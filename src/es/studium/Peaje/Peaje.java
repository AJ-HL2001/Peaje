package es.studium.Peaje;

import java.util.Scanner;

public class Peaje {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variables
			int km, toneladas, tipo;
			
		//Inicio
			System.out.println("Seleccione el tipo de vehiculo:");
			System.out.println("1-Moto");
			System.out.println("2-Coche");
			System.out.println("3-Camion");
			System.out.println("4-Autobus");
			tipo = teclado.nextInt();
			switch(tipo) {
				case 1:
					System.out.println("Tiene que pagar un total de 3,2€");
					break;
				case 2:
					System.out.println("¿Cuantos kilometros ha recorrido?");
					km = teclado.nextInt();
					System.out.println("Tiene que pagar un total de " + ((double)km*0.1) + "€");
					break;
				case 3:
					System.out.println("¿Cuantos kilometros ha recorrido?");
					km = teclado.nextInt();
					System.out.println("¿Cuantas toneladas transportas?");
					toneladas = teclado.nextInt();
					System.out.println("Tiene que pagar un total de " + (((double)km*0.1)+((double)toneladas*0.1)) + "€");
					break;
				case 4:
					System.out.println("¿Cuantos kilometros ha recorrido?");
					km = teclado.nextInt();
					System.out.println("Tiene que pagar un total de " + ((double)km*0.2) + "€");
					break;
				default:
					System.out.println("No ha seleccionado ningun tipo de vehiculo");
			}
			teclado.close();
	}
}





