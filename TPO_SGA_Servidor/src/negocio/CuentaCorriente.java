package negocio;

import dto.CuentaCorrienteDTO;

public class CuentaCorriente {

	private int nroCtaCte;
	private float montoMaxFinanciar;
	private float saldo;
	
	
	public CuentaCorriente() {
		
	}
	
	public CuentaCorriente(int nroCtaCte, float montoMaxFinanciar, float saldo) {
		this.nroCtaCte = nroCtaCte;
		this.montoMaxFinanciar = montoMaxFinanciar;
		this.saldo = saldo;
	}

	
	public int getNroCtaCte() {
		return nroCtaCte;
	}
	
	public void setNroCtaCte(int nroCtaCte) {
		this.nroCtaCte = nroCtaCte;
	}
	
	public float getMontoMaxFinanciar() {
		return montoMaxFinanciar;
	}

	public void setMontoMaxFinanciar(float montoMaxFinanciar) {
		this.montoMaxFinanciar = montoMaxFinanciar;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public CuentaCorrienteDTO toDTO() {
		CuentaCorrienteDTO resultado = new CuentaCorrienteDTO(nroCtaCte, montoMaxFinanciar, saldo);
		return resultado; 
	}
}
