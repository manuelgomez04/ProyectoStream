package ejemploConcesionario;

import java.util.List;

public class CrudExtra {
	private List<Extras> listaExtra;

	public CrudExtra(List<Extras> listaExtra) {
		super();
		this.listaExtra = listaExtra;
	}

	public List<Extras> getListaExtra() {
		return listaExtra;
	}

	public void setListaExtra(List<Extras> listaExtra) {
		this.listaExtra = listaExtra;
	}

	@Override
	public String toString() {
		return "CrudExtra [listaExtra=" + listaExtra + "]";
	}

	public void addExtra(Extras extra) {
		listaExtra.add(extra);
	}
}
