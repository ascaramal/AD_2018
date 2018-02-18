package dto;

import java.util.List;

public class OrdenAlmacenamientoDTO extends OrdenDTO {

	private int numeroOC;

	public OrdenAlmacenamientoDTO(int nroOrden, List<ItemOrdenDTO> itemsOrden, int numeroOC) {
		super(nroOrden, itemsOrden);
		this.numeroOC = numeroOC;
	}

	public int getNumeroOC() {
		return numeroOC;
	}

	public void setNumeroOC(int numeroOC) {
		this.numeroOC = numeroOC;
	}

	@Override
	public String toString() {
		return "OrdenAlmacenamientoDTO [numeroOC=" + numeroOC + "]";
	}

	
	
}
