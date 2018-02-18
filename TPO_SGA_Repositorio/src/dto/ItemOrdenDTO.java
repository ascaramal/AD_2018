package dto;

import java.io.Serializable;

public class ItemOrdenDTO implements Serializable{
	
	private static final long serialVersionUID = 3214889968987403725L;
	
	private int nroItemOrden;
	private ArticuloDTO articulo;
	private UbicacionDTO ubicacion;
	
	public ItemOrdenDTO(int nroItemOrden, ArticuloDTO articulo, UbicacionDTO ubicacion) {
		this.nroItemOrden = nroItemOrden;
		this.articulo = articulo;
		this.ubicacion = ubicacion;
	}

	public int getNroItemOrden() {
		return nroItemOrden;
	}

	public void setNroItemOrden(int nroItemOrden) {
		this.nroItemOrden = nroItemOrden;
	}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public UbicacionDTO getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(UbicacionDTO ubicacion) {
		this.ubicacion = ubicacion;
	}
	

	@Override
	public String toString() {
		return "ItemOrdenDTO [nroItemOrden=" + nroItemOrden + ", articulo=" + articulo + ", ubicacion=" + ubicacion
				+ "]";
	}
	
}
