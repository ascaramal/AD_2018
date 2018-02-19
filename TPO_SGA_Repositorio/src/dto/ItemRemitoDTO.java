package dto;

import java.io.Serializable;


public class ItemRemitoDTO implements Serializable {

	private static final long serialVersionUID = -8459137439331192807L;
	
	private int nroItemRemito;
	private ArticuloDTO articulo;
	private int cant;

	public ItemRemitoDTO() {
		
	}
	
	public int getNroItemRemito() {
		return nroItemRemito;
	}

	public void setNroItemRemito(int nroItemRemito) {
		this.nroItemRemito = nroItemRemito;
	}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "ItemRemitoDTO [nroItemRemito=" + nroItemRemito + ", articulo=" + articulo + ", cant=" + cant + "]";
	}
	
	
}
