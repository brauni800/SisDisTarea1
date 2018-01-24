package model;

public class Bolsa {

	private double monto;

	public Bolsa() {
		super();
		this.monto = 1000.0;
	}
	
	public void depositar(double deposito) {
		this.monto += deposito;
	}
	
	public double retirar(double retiro) throws NoDinero{
		if (this.monto < retiro) {
			return this.monto -= retiro;
		} else {
			throw new NoDinero("No hay suficiente dinero en la bolsa");
		}
	}
}
