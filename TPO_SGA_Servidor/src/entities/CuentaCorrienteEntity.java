package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import dto.CuentaCorrienteDTO;
import negocio.CuentaCorriente;

@Entity
@Table(name="CuentasCorrientes")
public class CuentaCorrienteEntity implements Serializable {

	private static final long serialVersionUID = -3474894927171250050L;
	
	@Id
	@GeneratedValue
	@Column(name="nroCuentaCorriente_id")
	private Integer nroCtaCte;
	private float montoMaxFinanciar;
	private float saldo;
	
	
	public CuentaCorrienteEntity() {
		
	}
	
	public CuentaCorrienteEntity(Integer nroCtaCte, float montoMaxFinanciar, float saldo) {
		this.nroCtaCte = nroCtaCte;
		this.montoMaxFinanciar = montoMaxFinanciar;
		this.saldo = saldo;
	}


	public Integer getNroCtaCte() {
		return nroCtaCte;
	}
	
	public void setNroCtaCte(Integer nroCtaCte) {
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
		CuentaCorrienteDTO ctaCte = new CuentaCorrienteDTO();
		ctaCte.setNroCtaCte(this.nroCtaCte);
		ctaCte.setMontoMaxFinanciar(this.montoMaxFinanciar);
		ctaCte.setSaldo(this.saldo);
		
		return ctaCte;
	}
	
	public CuentaCorriente toNegocio() {
		CuentaCorriente resultado = new CuentaCorriente();
		resultado.setNroCtaCte(this.nroCtaCte);
		resultado.setMontoMaxFinanciar(this.montoMaxFinanciar);
		resultado.setSaldo(this.saldo);
		//System.out.println("Test" + resultado.toString());
		return resultado;
	}
}
