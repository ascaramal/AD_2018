package negocio;

import java.util.ArrayList;

import dto.ClienteDTO;
import dto.ItemRemitoDTO;

public class ItemRemito {

	private int nroItemRemito;
	private Articulo articulo;
	private int cant;
	
	public ItemRemito(int nroItemRemito, Articulo articulo, int cant) {
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

	public ItemRemitoDTO toDTO() {
		ItemRemitoDTO res = new ItemRemitoDTO();
		res.setCant(cant);

		res.setNroItemRemito(this.nroItemRemito);
		//res.setArticulo(this.getArticulo());
		res.setCant(this.cant);
		
		return res; 
	}
	
	
}
