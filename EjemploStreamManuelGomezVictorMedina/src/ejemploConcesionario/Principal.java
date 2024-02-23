package ejemploConcesionario;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		List<Coche> listaCoches = new ArrayList<Coche>();
		List<Extras> listaExtra = new ArrayList<>();
		listaExtra.add(new Extras("Tiene", "No tiene"));

		CrudCoche crudCoche = new CrudCoche(listaCoches);
		Concesionario concesionario = new Concesionario(crudCoche);

		String marca, modelo, numBastidor;
		double caballos, precio;
		boolean extras, vendido = false;
		int opcion, opcion2, LeerExtras, LeerVendido, opcion3, limit, skip;

		Coche coche = new Coche("Seat", "Leon", "6425T", 450, 400000, listaExtra, false);
		Coche coche1 = new Coche("Audi", "A4", "43643Y", 390, 250000, listaExtra, true);
		Coche coche2 = new Coche("Peugeot", "P5", "7623U", 600, 590000, listaExtra, true);
		Coche coche3 = new Coche("Seat", "Ibiza", "7923R", 450, 400000, listaExtra, false);
		Coche coche4 = new Coche("Seat", "Leon", "1630L", 450, 400000, listaExtra, false);
		Coche coche5 = new Coche("Seat", "Leon", "0258G", 450, 400000, listaExtra, true);

		crudCoche.addCoche(coche);
		crudCoche.addCoche(coche1);
		crudCoche.addCoche(coche2);
		crudCoche.addCoche(coche3);
		crudCoche.addCoche(coche4);
		crudCoche.addCoche(coche5);

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
					8 ---> FlatMap (No sé aún)
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

				// Hay que poner los extras bien.
				System.out.println("El coche tiene puertas 1-Si 2-No");

				coche = new Coche(marca, modelo, numBastidor, caballos, precio, listaExtra, vendido);
				crudCoche.addCoche(coche);
				System.out.println();
				break;
			case 2:
				do {
					System.out.println("""
							1 ---> Mostrar lista de coches por modelos, saltando N primeros coches.
							2 ---> Mostrar lista de coches por modelos, limitando el resultado a N coches.
							3 ---> Mostrar el coche por el número de bastidor.
							4 ---> Mostrar lista de coches por marca.
							0 ---> Volver
							""");
					opcion3 = Leer.datoInt();

					switch (opcion3) {
					case 1:
						System.out.println("Diga el modelo del coche que desea ver");
						modelo = Leer.dato();
						System.out.println("Diga el número de coches que desea saltar");
						skip = Leer.datoInt();

						crudCoche.mostrar(crudCoche.findListaModelosSkipN(modelo, skip));
						break;
					case 2:
						System.out.println("Diga el modelo del coche que desea ver");
						modelo = Leer.dato();
						System.out.println("Diga el número de coches que desea mostrar");
						limit = Leer.datoInt();
						crudCoche.mostrar(crudCoche.findNModelos(modelo, limit));
						break;

					case 3:
						System.out.println("Introduzca el número de bastidor del coche que quiere borrar");
						numBastidor = Leer.dato();
						crudCoche.borrarCoche(numBastidor);

						System.out.println(crudCoche.findByNumBastidor(numBastidor));
						break;

					case 4:
						System.out.println("Diga la marca de coche que desea ver");
						marca = Leer.dato();

						crudCoche.mostrar(crudCoche.buscarPorMarca(marca));
						break;

					case 0:

						break;
					default:

						System.out.println("Inserte dato válido");
						break;
					}

				} while (opcion3 != 0);
				break;
			case 3:

				System.out.printf("Las ganancias totales son: %.2f€", concesionario.calcularGanancias());
				System.out.println();

				break;
			case 4:
				System.out.println(concesionario.contarCocheVendidos());
				break;
			case 5:
				System.out.println("Intoduzca la marca para calcular el precio medio");
				marca = Leer.dato();
				System.out.printf("El precio medio de los coches de la marca es: %.2f€",
						concesionario.calcularMediaPrecioCoches(marca));
				System.out.println();
				break;
			case 6:
				do {
					System.out.println("""
							1 ----> Ordenar por precio
							2 ----> Ordenar por orden alfabetico
							0 ----> Salir
							""");
					opcion2 = Leer.datoInt();
					switch (opcion2) {
					case 1:

						crudCoche.mostrar(concesionario.ordenarPorPrecioMayorAMenor());
						System.out.println();
						break;
					case 2:
						crudCoche.mostrar(concesionario.ordenarPorOrdenAlfabeticoMarcaYModelo());
						System.out.println();
						break;
					default:
						System.out.println("Introduzca una opción correcta");
						break;
					case 0:

						break;
					}

				} while (opcion2 != 0);
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
