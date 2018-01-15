package model;

import java.util.ArrayList;

public class Cliente {

	private ArrayList<Item> carro;

	public Cliente() {
		super();
		this.carro = new ArrayList<>();
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
