package ejemploConcesionario;

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

	// Añadir coche -- Víctor
	public void addCoche(Coche coche) {
		listaCoche.add(coche);
	}
	// Modificar precio -- Manuel

	public void modificarPrecio(String numBastidor, double nuevoPrecio) {
		findByNumBastidor(numBastidor).setPrecio(nuevoPrecio);
	}

	// Borrar coche --Víctor
	public void borrarCoche(String numBastidor) {

		listaCoche.remove(findByNumBastidor(numBastidor));
	}

	// Mostrar coches (For each)-- Víctor

	public void mostrar(List<Coche> listaCoches) {
		listaCoches.stream().forEach(System.out::println);
	}

	// Método para buscar un coche por su número de bastidor

	public Coche findByNumBastidor(String numBastidor) {

		return listaCoche.stream().filter(coche -> coche.getNumBastidor().equalsIgnoreCase(numBastidor)).findFirst()
				.get();
	}

	// Método para buscar N coches por su modelo, siguiendo el orden de inserción

	public List<Coche> findNModelos(String modelo, int limit) {

		return listaCoche.stream().filter(coche -> coche.getModelo().equalsIgnoreCase(modelo)).limit(limit).toList();
	}

	public List<Coche> findModelos(String modelo) {
		return listaCoche.stream().filter(coche -> coche.getModelo().equalsIgnoreCase(modelo)).toList();
	}
	

	// Método para buscar coches del mismo modelo, pero saltando N coches siguiendo
	// el orden de insercion
	public List<Coche> findListaModelosSkipN(String modelo, int skip) {

		return listaCoche.stream().filter(coche -> coche.getModelo().equalsIgnoreCase(modelo)).skip(skip).toList();
	}

	// Este metodo busca una lista de coches por la marca del coche
	public List<Coche> buscarPorMarca(String marca) {

		return listaCoche.stream().filter(coche -> coche.getMarca().equalsIgnoreCase(marca)).toList();
	}

	// Este metodo sirve para buscar coches que se han vendido
	public List<Coche> buscarVendidos() {

		return listaCoche.stream().filter(coche -> coche.isVendido()).toList();
	}
}
