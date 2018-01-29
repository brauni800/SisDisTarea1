package model;

public class Bolsa {

	private double monto;

	public Bolsa(Bolsa otraBolsa) {
		super();
		this.monto = otraBolsa.consulta();
	}
	
	public Bolsa() {
		super();
		this.monto = 0.0;
	}
	
	public void depositar(double deposito) {
		this.monto += deposito;
	}
	
	public void depositar(Bolsa otraBolsa) {
		this.monto += otraBolsa.consulta();
	}
	
	public double retirar(double retiro) throws NoDinero{
		if (this.monto < retiro) {
			return this.monto -= retiro;
		} else {
			throw new NoDinero("No hay suficiente dinero en la bolsa");
		}
	}
	public double consulta() {
		return this.monto;
	}
}
