package model;

import java.util.ArrayList;

public class Cajero extends Thread {

	private ArrayList<Cliente> clientes;
	private int id;
	
	
	public Cajero(int id, ArrayList<Cliente> clientes) {
		super();
		this.id = id;
		this.clientes = clientes;
	}

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < this.clientes.size(); i++) {
			Cliente cliente = this.clientes.remove(0);
			System.out.println("El cliente " + cliente.getId() + " se atendió en la caja " + this.id);
		}
	}
}
