package model;

import java.util.ArrayList;

public class Cajero extends Thread {

	private Cliente cliente;
	private int id;
	
	
	public Cajero(int id, ArrayList<Cliente> clientes) {
		super();
		this.id = id;
		this.cliente = clientes.get(0);
	}

	@Override
	public void run() {
		super.run();
		System.out.println("El cliente " + this.cliente.getId() + " se atendió en la caja " + this.id);
	}
	
}
