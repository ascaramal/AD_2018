package entities;

import javax.persistence.*;

@Entity
@Table(name="ItemsRemito")
public class ItemRemitoEntity {
	
	@EmbeddedId
    private ItemRemitoID id; 
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="nroItemRemito")
	private int nroItemRemito;
	
	private ArticuloEntity articulo;
	
	@Column(name="cantidad")
	private int cant;
	
	public ItemRemitoEntity() {
		
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
