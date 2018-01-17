package model;

import java.util.ArrayList;

public class Cliente {

	private ArrayList<Item> carro;
	private int id;

	public Cliente(int id) {
		super();
		this.id = id;
		this.carro = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public void addCarro(Item item) {
		this.carro.add(item);
	}
	
	public Item getItem(int i) {
		return this.carro.get(i);
	}
	
	public int sizeCarro() {
		return this.carro.size();
	}
}
