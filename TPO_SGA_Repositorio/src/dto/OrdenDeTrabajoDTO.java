package dto;

import java.io.Serializable;

public class OrdenDeTrabajoDTO implements Serializable {

	private static final long serialVersionUID = 7177110265279501316L;

	private ArticuloDTO articulo;
	private int cantidad;
	private UbicacionDTO Ubicacion;
	private OrdenDeCompraDTO ordenDeCompra;
	private PedidoDTO pedido;
	
	public OrdenDeTrabajoDTO() {
		
	}

	public ArticuloDTO getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloDTO articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public UbicacionDTO getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(UbicacionDTO ubicacion) {
		Ubicacion = ubicacion;
	}

	public OrdenDeCompraDTO getOrdenDeCompra() {
		return ordenDeCompra;
	}

	public PedidoDTO getPedido() {
		return pedido;
	}

	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}

	public void setOrdenDeCompra(OrdenDeCompraDTO ordenDeCompra) {
		this.ordenDeCompra = ordenDeCompra;
	}

	@Override
	public String toString() {
		return "OrdenDeTrabajoDTO [articulo=" + articulo + ", cantidad=" + cantidad + ", Ubicacion=" + Ubicacion
				+ ", ordenDeCompra=" + ordenDeCompra + ", pedido=" + pedido + "]";
	}
	
	
	
}