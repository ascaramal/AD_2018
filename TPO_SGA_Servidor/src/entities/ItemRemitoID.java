package entities;

import java.io.Serializable;

import javax.persistence.*;


@Embeddable
public class ItemRemitoID implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9069280151211218073L;

	@ManyToOne
    @JoinColumn(name="Articulos", referencedColumnName="codArticulo", nullable = false)
    private ArticuloEntity articuloEntity;
	
	@ManyToOne
	@JoinColumn(name="Remitos", referencedColumnName="nroRemito", nullable = false)
	private RemitoEntity remitoEntity;

	public ArticuloEntity getArticuloEntity() {
		return articuloEntity;
	}

	public void setArticuloEntity(ArticuloEntity articuloEntity) {
		this.articuloEntity = articuloEntity;
	}

	public RemitoEntity getRemitoEntity() {
		return remitoEntity;
	}

	public void setRemitoEntity(RemitoEntity remitoEntity) {
		this.remitoEntity = remitoEntity;
	}
	
	

}
