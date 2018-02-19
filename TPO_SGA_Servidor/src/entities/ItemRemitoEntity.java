package entities;

public class ItemRemitoEntity {
	
	private int nroItemRemito;
	private ArticuloEntity articulo;
	private int cant;
	
	public ItemRemitoEntity() {
		
	}

	public int getNroItemRemito() {
		return nroItemRemito;
	}

	public void setNroItemRemito(int nroItemRemito) {
		this.nroItemRemito = nroItemRemito;
	}

	public ArticuloEntity getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	

}
