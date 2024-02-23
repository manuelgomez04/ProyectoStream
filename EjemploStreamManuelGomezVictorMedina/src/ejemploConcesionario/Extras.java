package ejemploConcesionario;

public class Extras {

	private int asientoTapizado;
	private int calefaccionAsientos;

	public Extras(int asientoTapizado, int calefaccionAsientos) {
		super();
		this.asientoTapizado = asientoTapizado;
		this.calefaccionAsientos = calefaccionAsientos;
	}

	public int getAsientoTapizado() {
		return asientoTapizado;
	}

	public void setAsientoTapizado(int asientoTapizado) {
		this.asientoTapizado = asientoTapizado;
	}

	public int getCalefaccionAsientos() {
		return calefaccionAsientos;
	}

	public void setCalefaccionAsientos(int calefaccionAsientos) {
		this.calefaccionAsientos = calefaccionAsientos;
	}

	@Override
	public String toString() {
		return "Extras [asientoTapizado=" + asientoTapizado + ", calefaccionAsientos=" + calefaccionAsientos + "]";
	}

}
