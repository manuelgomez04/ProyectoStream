package ejemploConcesionario;

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

	public OptionalDouble calcularMediaPrecioCochesPorMarca(String modelo) {

		return crudCoche.getListaCoche().stream().mapToDouble(t -> t.getPrecio()).average();
	}

	// Calcular media de precio de los coches de una marca (FlatMap) -- Manuel

	public OptionalDouble calcularMedia() {

		return 0.0;

	}

	// método sumar ganancias si se vende vehículo -- Victor
}
