package entities;


public class OrdenAlmacenamientoEntity extends OrdenEntity {

	private int numeroOC;

	public OrdenAlmacenamientoEntity() {
		
	}
	
	public OrdenAlmacenamientoEntity(int numeroOC) {
		super();
		this.numeroOC = numeroOC;
	}

	public int getNumeroOC() {
		return numeroOC;
	}

	public void setNumeroOC(int numeroOC) {
		this.numeroOC = numeroOC;
	}

	
}
