package ejemploConcesionario;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		List<Coche> listaCoches = new ArrayList<Coche>();
		CrudCoche crudCoche = new CrudCoche(listaCoches);
		Concesionario concesionario = new Concesionario(crudCoche);

		String marca, modelo, numBastidor;
		double caballos, precio;
		boolean extras, vendido = false;
		int opcion, opcion2, LeerExtras, LeerVendido;
		Coche coche = new Coche("Seat", "Leon", "6425T", 450, 400000, true, false);
		Coche coche1 = new Coche("Audi", "A4", "43643Y", 390, 250000, false, true);
		Coche coche2 = new Coche("Peugeot", "P5", "7623U", 600, 590000, true, true);

		crudCoche.addCoche(coche);
		crudCoche.addCoche(coche1);
		crudCoche.addCoche(coche2);
		crudCoche.mostrarCoches();

		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Añadir un coche al concesionario
					2 ---> Mostrar los coches del concesionario(Todos los mostrar)
					3 ---> Calcular ganancias si se venden todos los coches
					4 ---> Contar los coches vendidos
					5 ---> Calcular el precio medio de los coches de una marca
					6 ---> Ordenar coches por requisitos
					7 ---> Borrar un coche
					""");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduzca la marca del coche");
				marca = Leer.dato();
				System.out.println("Introduzca el modelo");
				modelo = Leer.dato();
				System.out.println("Introduzca el número de bastidor");
				numBastidor = Leer.dato();
				System.out.println("Introduzca los caballos que tiene el coche");
				caballos = Leer.datoDouble();
				System.out.println("Introduzca el precio del coche");
				precio = Leer.datoDouble();
				System.out.println("El coche tiene extras 1-Si 2-No");
				LeerExtras = Leer.datoInt();
				while (LeerExtras != 1 && LeerExtras != 2) {
					System.out.println("Introduzca una opción correcta");
					LeerExtras = Leer.datoInt();
				}
				if (LeerExtras == 1) {
					extras = true;
				} else {
					extras = false;
				}
				coche = new Coche(marca, modelo, numBastidor, caballos, precio, extras, vendido);
				crudCoche.addCoche(coche);
				System.out.println();
				break;
			case 2:
				do {
					System.out.println("""
							1-Ordenar por precio
							2-Ordenar por orden alfabetico
							""");
					opcion2 = Leer.datoInt();
					switch (opcion2) {
					case 1:
						for (Coche coche : listaCoches) {

						}
						concesionario.ordenarPorPrecioMayorAMenor();
						break;
					case 2:
						concesionario.ordenarPorOrdenAlfabeticoMarcaYModelo();
						break;

					}

				} while (opcion2 != 0);

				break;
			case 3:

				System.out.printf("Las ganancias totales son: %.2f", concesionario.calcularGanancias());
				System.out.println();

				break;
			case 4:
				concesionario.contarCocheVendidos();
				break;
			case 5:
				System.out.println("Intoduzca la marca para calcular el precio medio");
				marca = Leer.dato();
				System.out.printf("El precio medio de los coches de la marca es: %.2f",
						concesionario.calcularMediaPrecioCoches(marca));
				System.out.println();
				break;
			case 6:

				break;
			case 7:
				System.out.println("Introduzca el número de bastidos del coche que quiere borrar");
				numBastidor = Leer.dato();
				crudCoche.borrarCoche(numBastidor);
				break;

			default:
				System.out.println("Introduzca una opción correcta");
				System.out.println();
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			}

		} while (opcion != 0);

	}

}
