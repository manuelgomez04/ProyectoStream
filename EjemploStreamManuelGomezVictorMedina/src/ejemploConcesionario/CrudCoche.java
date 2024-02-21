package ejemploConcesionario;

import java.util.Comparator;
import java.util.List;

public class CrudCoche {

	private List<Coche> listaCoche;

	public CrudCoche(List<Coche> listaCoche) {
		super();
		this.listaCoche = listaCoche;
	}

	public List<Coche> getListaCoche() {
		return listaCoche;
	}

	public void setListaCoche(List<Coche> listaCoche) {
		this.listaCoche = listaCoche;
	}

	@Override
	public String toString() {
		return "CrudCoche [listaCoche=" + listaCoche + "]";
	}

	// Buscar numBastidor, modelo (limit y skip) -- Manuel

	// Método para buscar un coche por su número de bastidor

	public Coche findByNumBastidor(String numBastidor) {

		return listaCoche.stream().filter(t -> t.getNumBastidor().equalsIgnoreCase(numBastidor)).findFirst().get();
	}

	// Método para buscar N coches por su modelo, siguiendo el orden de inserción

	public List<Coche> findNModelos(String modelo, int limit) {

		return listaCoche.stream().filter(t -> t.getModelo().equalsIgnoreCase(modelo)).limit(limit).toList();
	}

	public List<Coche> findModelos(String modelo) {
		return listaCoche.stream().filter(t -> t.getModelo().equalsIgnoreCase(modelo)).toList();
	}

	// Método para buscar coches del mismo modelo, pero saltando N coches siguiendo
	// el orden de insercion
	public List<Coche> findListaModelosSkipN(String modelo, int skip) {

		return listaCoche.stream().filter(t -> t.getModelo().equalsIgnoreCase(modelo)).skip(skip).toList();
	}

	// marca ( filter, find Any / First) -- Víctor

	// Modificar precio u otras cosas -- Manuel

	public void modificarPrecio(String numBastidor, double nuevoPrecio) {
		findByNumBastidor(numBastidor).setPrecio(nuevoPrecio);
	}

	// Borrar coche --Víctor

	// Añadir coche -- Víctor

	// Método para ordenar la lista de coches dada por el precio.

	public List<Coche> ordenarPorPrecioMayorAMenor() {
		Comparator<Coche> compararPrecios = Comparator.comparing(Coche::getPrecio);

		return listaCoche.stream().sorted(compararPrecios).toList();
	}

	// Método para ordenar la lista de coches dadapor la marca y el modelo

	public List<Coche> ordenarPorOrdenAlfabeticoMarcaYModelo() {
		Comparator<Coche> compararMarcaYModelo = Comparator.comparing(Coche::getMarca)
				.thenComparing(Comparator.comparing(Coche::getModelo));

		return listaCoche.stream().sorted(compararMarcaYModelo).toList();

	}

	// Mostrar coches (For each)-- Víctor

}
