package controlador;

import java.util.List;

import dto.ArticuloDTO;

public class ControladorAlmacen {

	private static ControladorAlmacen instancia;


	private static ControladorAlmacen getInstancia() {
		if(instancia == null)
			instancia = new ControladorAlmacen();
		return instancia;
	}
	
	public void modificarStockPorAjuste(int nroArticulo, int cant, int nroLegajo) {
		
	}
	
	public boolean controlarStockPedido(int nroPedido) {
		
		return false;
	}
	
	public void recibirOrdenDeCompra(List<ArticuloDTO> lst, int nroOrdComp) {
		
	}
	
	public void imprimirRecepcion() {
		
	}
	
	public void modificarStockAutomaticoPorVta(int nroPedido) {
		
	}
	
	public void modificarStockAutomaticoPorCompra(int nroOrdenCompra) {
		
	}
	
	public int consultarStock(int nroArticulo) {
		
		return nroArticulo;
	}
}
