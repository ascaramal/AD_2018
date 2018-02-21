package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="Lotes")
public class LoteEntity  {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codLote;
	private Date fechaVtoLote;
	
	@OneToMany
	@JoinColumn(name="codLote")
	private List<UbicacionEntity> ubicaciones;
	
	@ManyToOne
	@JoinColumn(name="codArticulo")
	private ArticuloEntity articulo;

	@ManyToMany
	@J
	

	//Constructor
	public LoteEntity() {
		this.ubicaciones = new ArrayList<UbicacionEntity>();
	}


	public int getCodLote() {
		return codLote;
	}


	public void setCodLote(int codLote) {
		this.codLote = codLote;
	}


	public Date getFechaVtoLote() {
		return fechaVtoLote;
	}


	public void setFechaVtoLote(Date fechaVtoLote) {
		this.fechaVtoLote = fechaVtoLote;
	}


	public List<UbicacionEntity> getUbicaciones() {
		return ubicaciones;
	}


	public void setUbicaciones(List<UbicacionEntity> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}


	public ArticuloEntity getArticulo() {
		return articulo;
	}


	public void setArticulo(ArticuloEntity articulo) {
		this.articulo = articulo;
	}

	
}
