package entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ItemsRemito")
public class ItemRemitoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nroItemRemito;

	@ManyToOne
	@JoinColumn(name = "codArticulo")
	private ArticuloEntity articulo;

	@Column(name = "cantidad")
	private int cant;

	@ManyToOne
	@JoinColumn(name = "nroRemito")
	private RemitoEntity remito;

	
	// Constructor
	public ItemRemitoEntity() {

	}

	public RemitoEntity getRemito() {
		return remito;
	}

	public void setRemito(RemitoEntity remito) {
		this.remito = remito;
	}

	public int getNroItemRemito() {
		return nroItemRemito;
	}

	public void setNroItemRemito(int nroItemRemito) {
		this.nroItemRemito = nroItemRemito;
	}

	public ArticuloEntity getArticulo() {
		return articulo;
	}

	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

}
