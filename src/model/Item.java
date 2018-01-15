package model;

public class Item {

	private int id;
	private double precio;
	private int tiempoProceso;
	
	
	public Item() {
		super();
	}

	public Item(int id, double precio, int tiempoProceso) {
		super();
		this.id = id;
		this.precio = precio;
		this.tiempoProceso = tiempoProceso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getTiempoProceso() {
		return tiempoProceso;
	}

	public void setTiempoProceso(int tiempoProceso) {
		this.tiempoProceso = tiempoProceso;
	}
}
