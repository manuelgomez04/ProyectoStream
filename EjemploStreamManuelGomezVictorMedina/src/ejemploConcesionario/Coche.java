package ejemploConcesionario;

public class Coche {

	private String marca;
	private String modelo;
	private String numBastidor;
	private double caballos;
	private double precio;
	private boolean extras;
	private boolean vendido;

	public Coche(String marca, String modelo, String numBastidor, double caballos, double precio, boolean extras,
			boolean vendido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numBastidor = numBastidor;
		this.caballos = caballos;
		this.precio = precio;
		this.extras = extras;
		this.vendido = vendido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isExtras() {
		return extras;
	}

	public void setExtras(boolean extras) {
		this.extras = extras;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", numBastidor=" + numBastidor + ", caballos="
				+ caballos + ", precio=" + precio + ", extras=" + extras + ", vendido=" + vendido + "]";
	}

}
