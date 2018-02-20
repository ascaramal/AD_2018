package entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemPedidoID implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6824351227393496091L;

	@ManyToOne
    @JoinColumn(name="Articulos", referencedColumnName="codArticulo", nullable = false)
    private ArticuloEntity articuloEntity;
	
	@ManyToOne
	@JoinColumn(name="Pedidos", referencedColumnName="codArticulo", nullable = false)
	private RemitoEntity remitoEntity;
	
}
