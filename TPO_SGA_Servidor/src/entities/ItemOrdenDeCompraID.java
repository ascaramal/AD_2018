package entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemOrdenDeCompraID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1075025079463470852L;

	
	@ManyToOne
    @JoinColumn(name="Articulos", referencedColumnName="codArticulo", nullable = false)
    private ArticuloEntity articuloEntity;
	
	@ManyToOne
	@JoinColumn(name="Remitos", referencedColumnName="nroRemito", nullable = false)
	private RemitoEntity remitoEntity;
}
