package ejemploConcesionario;

public class Extras {

	private String asientoTapizado;
	private String calefaccionAsientos;

	public Extras(String asientoTapizado, String calefaccionAsientos) {
		super();
		this.asientoTapizado = asientoTapizado;
		this.calefaccionAsientos = calefaccionAsientos;
	}

	public String getAsientoTapizado() {
		return asientoTapizado;
	}

	public void setAsientoTapizado(String asientoTapizado) {
		this.asientoTapizado = asientoTapizado;
	}

	public String getCalefaccionAsientos() {
		return calefaccionAsientos;
	}

	public void setCalefaccionAsientos(String calefaccionAsientos) {
		this.calefaccionAsientos = calefaccionAsientos;
	}

	@Override
	public String toString() {
		return "Extras [asientoTapizado=" + asientoTapizado + ", calefaccionAsientos=" + calefaccionAsientos + "]";
	}

}
