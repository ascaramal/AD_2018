package negocio;

import java.util.List;

public class Stock {
	
	private int nroStock;
	private int cantReal;
	private int cantFuturoDisponible;
	private int cantReservada;
	private List<Movimiento> movimientos;
	

	public Stock(int nroStock, int cantReal, int cantFuturoDisponible, int cantReservada,
			List<Movimiento> movimientos) {
		super();
		this.nroStock = nroStock;
		this.cantReal = cantReal;
		this.cantFuturoDisponible = cantFuturoDisponible;
		this.cantReservada = cantReservada;
		this.movimientos = movimientos;
	}

	public int getNroStock() {
		return nroStock;
	}
	
	public void setNroStock(int nroStock) {
		this.nroStock = nroStock;
	}
	
	public int getCantReal() {
		return cantReal;
	}
	
	public void setCantReal(int cantReal) {
		this.cantReal = cantReal;
	}
	
	public int getCantFuturoDisponible() {
		return cantFuturoDisponible;
	}
	
	public void setCantFuturoDisponible(int cantFuturoDisponible) {
		this.cantFuturoDisponible = cantFuturoDisponible;
	}
	
	public int getCantReservada() {
		return cantReservada;
	}

	public void setCantReservada(int cantReservada) {
		this.cantReservada = cantReservada;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	
	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
	
	public boolean calcularStockDisponible() {
		return false;
		
	}
}
