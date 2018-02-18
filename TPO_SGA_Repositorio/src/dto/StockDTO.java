package dto;

import java.io.Serializable;
import java.util.List;

public class StockDTO implements Serializable {

	private static final long serialVersionUID = -2762674889361894082L;
	
	private int nroStock;
	private int cantReal;
	private int cantFuturoDisponible;
	private int cantReservada;
	private List<MovimientoDTO> movimientos;
	

	public StockDTO(int nroStock, int cantReal, int cantFuturoDisponible, int cantReservada,
			List<MovimientoDTO> movimientos) {
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

	public List<MovimientoDTO> getMovimientos() {
		return movimientos;
	}
	
	public void setMovimientos(List<MovimientoDTO> movimientos) {
		this.movimientos = movimientos;
	}
	
	@Override
	public String toString() {
		return "StockDTO [nroStock=" + nroStock + ", cantReal=" + cantReal + ", cantFuturoDisponible="
				+ cantFuturoDisponible + ", cantReservada=" + cantReservada + ", movimientos=" + movimientos + "]";
	}

	public boolean calcularStockDisponible() {
		return false;
		
	}
}
