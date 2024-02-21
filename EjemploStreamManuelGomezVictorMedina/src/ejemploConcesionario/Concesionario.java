package ejemploConcesionario;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Concesionario {

	private CrudCoche crudCoche;

	// Contar vehículos vendidos (Count) --Víctor
	public long contarCocheVendidos() {

		return crudCoche.buscarVendidos().stream().count();
	}

	// Calcular ganancias si se venden todos (Map) --Manuel

	public double calcularGanancias() {

		return crudCoche.getListaCoche().stream().mapToDouble(t -> t.getPrecio()).sum();
	}

	// Calcular media de precio de coches (Map x2) -- Manuel

	public OptionalDouble calcularMediaPrecioCoches() {

		return crudCoche.getListaCoche().stream().mapToDouble(t -> t.getPrecio()).average();
	}

	// Calcular media de precio de los coches de una marca (FlatMap) -- Manuel

//	public OptionalDouble calcularMediaPrecioPorModelo(String modelo) {
//
//		return cc.getListaCoche().stream().flatMap(coche -> coche.().stream());
//
//	}

	// método sumar ganancias si se vende vehículo -- Victor

	// Método para ordenar la lista de coches dada por el precio.

	public List<Coche> ordenarPorPrecioMayorAMenor() {
		Comparator<Coche> compararPrecios = Comparator.comparing(Coche::getPrecio);

		return crudCoche.getListaCoche().stream().sorted(compararPrecios).toList();
	}

	// Método para ordenar la lista de coches dadapor la marca y el modelo

	public List<Coche> ordenarPorOrdenAlfabeticoMarcaYModelo() {
		Comparator<Coche> compararMarcaYModelo = Comparator.comparing(Coche::getMarca)
				.thenComparing(Comparator.comparing(Coche::getModelo));

		return crudCoche.getListaCoche().stream().sorted(compararMarcaYModelo).toList();

	}
}
