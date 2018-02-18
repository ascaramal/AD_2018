package negocio;

import java.util.List;

public class OrdenAlmacenamiento extends Orden {

	private int numeroOC;

	public OrdenAlmacenamiento(int nroOrden, List<ItemOrden> itemsOrden, int numeroOC) {
		super(nroOrden, itemsOrden);
		this.numeroOC = numeroOC;
	}

	public int getNumeroOC() {
		return numeroOC;
	}

	public void setNumeroOC(int numeroOC) {
		this.numeroOC = numeroOC;
	}
	
	
}
