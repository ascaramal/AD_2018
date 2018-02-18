package negocio;

public class ItemRemito {

	private int nroItemRemito;
	private Articulo articulo;
	private int cant;
	
	public ItemRemito(int nroItemRemito, Articulo articulo, int cant) {
		super();
		this.nroItemRemito = nroItemRemito;
		this.articulo = articulo;
		this.cant = cant;
	}
	
	public int getNroItemRemito() {
		return nroItemRemito;
	}
	
	public void setNroItemRemito(int nroItemRemito) {
		this.nroItemRemito = nroItemRemito;
	}
	
	public Articulo getArticulo() {
		return articulo;
	}
	
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	public int getCant() {
		return cant;
	}
	
	public void setCant(int cant) {
		this.cant = cant;
	}
	
	
}
