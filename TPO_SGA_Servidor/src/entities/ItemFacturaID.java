package entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemFacturaID implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3429254631622654938L;

	
	@ManyToOne
    @JoinColumn(name="Articulos", referencedColumnName="codArticulo", nullable = false)
    private ArticuloEntity articuloEntity;
	
	@ManyToOne
	@JoinColumn(name="Remitos", referencedColumnName="nroRemito", nullable = false)
	private RemitoEntity remitoEntity;
}
