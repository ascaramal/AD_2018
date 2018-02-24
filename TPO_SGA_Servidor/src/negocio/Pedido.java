package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.PedidoDAO;
import dto.ItemPedidoDTO;
import dto.OrdenDeTrabajoDTO;
import dto.PedidoDTO;
import enumerations.EstadoPedido;
import exceptions.DAOException;

public class Pedido {

	private int nroPedido;
	private Cliente cliente;
	private EstadoPedido estadoPedido;
	private Date fechaGeneracion;
	private Date fechaDespacho;
	private List<ItemPedido> itemsPedido;
	private List<OrdenDeTrabajo> ordenesDeTrabajo;
	private float total;
	
	public Pedido() {
		this.itemsPedido = new ArrayList<ItemPedido>();
		this.ordenesDeTrabajo = new ArrayList<OrdenDeTrabajo>();
		
	}
	
	public Pedido(int nroPedido, Cliente cliente, EstadoPedido estadoPedido, Date fechaGeneracion, Date fechaDespacho,
			List<ItemPedido> itemsPedido, List<OrdenDeTrabajo> ordenesDeTrabajo, float total) {
		this.nroPedido = nroPedido;
		this.cliente = cliente;
		this.estadoPedido = estadoPedido;
		this.fechaGeneracion = fechaGeneracion;
		this.fechaDespacho = fechaDespacho;
		this.itemsPedido = new ArrayList<ItemPedido>();
		this.ordenesDeTrabajo = new ArrayList<OrdenDeTrabajo>();
		this.total = total; 
	}

	public int getNroPedido() {
		return nroPedido;
	}

	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public Date getFechaDespacho() {
		return fechaDespacho;
	}

	public void setFechaDespacho(Date fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}

	public List<ItemPedido> getItemsPedido() {
		return itemsPedido;
	}

	public void setItemsPedido(List<ItemPedido> itemsPedido) {
		this.itemsPedido = itemsPedido;
	}

	public List<OrdenDeTrabajo> getOrdenesDeTrabajo() {
		return ordenesDeTrabajo;
	}

	public void setOrdenesDeTrabajo(List<OrdenDeTrabajo> ordenesDeTrabajo) {
		this.ordenesDeTrabajo = ordenesDeTrabajo;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	
	//Metodos
	public void agregarItemPedido(ItemPedido itemP) {
		itemsPedido.add(itemP);
	}
	
//	public boolean controlarLimiteCredito()
//	{
//		//Saldo disponible del Cliente:
//		float maxC = this.cliente.getLimiteDeCredito();
//		float totalP = 0;
//		//Total de los pedidos:
//		for (int i = 0; i < this.itemsPedido.size(); i++)
//		{
//			totalP = totalP + itemsPedido.get(i).calcularSubtotal();
//		}
//		
//		//Comparo y devuelvo;
//		if(totalP > maxC) //si el pedio es mayor al saldo disponible
//			return false;
//		else
//			return true;
//	public EstadoPedido controlarLimiteCredito() {
//	
//		if(this.getCliente().getSaldo() >= getTotalPedido())
//			return EstadoPedido.Pendiente;
//		return EstadoPedido.Rechazado;
//	}
//	
//	public float getTotalPedido() {
//		float totalPedido = 0;
//		for(ItemPedido i : this.getItemsPedido()) {
//			totalPedido += i.getArticulo().getPrecio()*i.getCantidad();
//		}
//		return totalPedido;
//	}
	
	//Devuleve una lista de articulos faltantes que luego generará la orden de compra.
//	public List<Articulo> controlarStockPedido() {
//		List<Articulo> articulosFaltantes = new ArrayList<Articulo>();
//		
//		for(ItemPedido itemPedido : this.getItemsPedido()) {
//			if(itemPedido.getCantidad() < (itemPedido.getArticulo().getCantReal() - itemPedido.getArticulo().getCantReservada())) 
//				if(itemPedido.getCantidad() < (itemPedido.getArticulo().getCantReal() 
//						+ itemPedido.getArticulo().getCantFuturoDisponible() 
//						- itemPedido.getArticulo().getCantReservada()))
//					articulosFaltantes.add(itemPedido.getArticulo());
//		}
//		return articulosFaltantes;
//	}
	
	public PedidoDTO toDTO() {
		PedidoDTO res = new PedidoDTO();
		res.setNroPedido(this.nroPedido);
		res.setCliente(this.cliente.toDTO());
		res.setEstadoPedido(this.estadoPedido);
		res.setFechaGeneracion(this.getFechaGeneracion());
		res.setFechaDespacho(this.fechaDespacho);
		res.setTotal(this.total);
		
		for(ItemPedido iPedidoAux : this.getItemsPedido()) {
			ItemPedidoDTO itemPDTO = iPedidoAux.toDTO();
			itemPDTO.setPedido(res);
			
		}
		
		for(OrdenDeTrabajo oDeTAux : this.getOrdenesDeTrabajo()) {
			OrdenDeTrabajoDTO oDeTDTO = oDeTAux.toDTO();
			oDeTDTO.setPedido(res);
		}
		
		return res;
	}
	
	public void save() {
		PedidoDAO.getInstancia().altaPedido(this);
		
	}
	
}
