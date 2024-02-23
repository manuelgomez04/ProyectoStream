package ejemploConcesionario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String  aux;
		int opcion;
		Scanner sc = new Scanner (System.in);
		
		
		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Añadir un coche al concesionario
					2 ---> Mostrar los coches del concesionario
					3 ---> Calcular ganancias si se venden todos los coches
					4 ---> Contar los coches vendidos
					5 ---> Calcular el precio medio de los coches de una marca
					6 ---> Ordenar coches por requisitos
					""");
			
			
			aux = sc.nextLine();
			opcion =  Integer.parseInt(aux);
			
			
		} while (opcion != 0);
		
	}

}
