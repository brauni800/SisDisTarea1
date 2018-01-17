package controller;

import java.util.ArrayList;

import model.Cajero;
import model.Cliente;
import model.Item;

public class Tienda {

	public static void main(String[] args) {
		/**
		 * Se crea una lista de clientes y los items disponibles de la tienda
		 */
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		Item arroz = new Item(1, 30, 2);
		Item frijol = new Item(2, 28, 3);
		Item leche = new Item(3, 14.5, 1);
		Item azucar = new Item(4, 32, 5);
		Item maiz = new Item(5, 20.5, 3);
		Item huevo = new Item(6, 4, 1);
		Item manzana = new Item(7, 12.5, 2);
		Item zanahoria = new Item(8, 8, 1);
		Item pan = new Item(9, 19, 3);
		Item sal = new Item(10, 30, 5);
		
		/**
		 * Se crean los clientes y se agregan items a sus carros de compra
		 */
		Cliente sam = new Cliente(1);
		sam.addCarro(arroz);
		sam.addCarro(frijol);
		sam.addCarro(leche);
		sam.addCarro(huevo);
		sam.addCarro(pan);
		
		Cliente pepe = new Cliente(2);
		pepe.addCarro(pan);
		pepe.addCarro(zanahoria);
		pepe.addCarro(maiz);
		pepe.addCarro(sal);
		
		Cliente luis = new Cliente(3);
		luis.addCarro(huevo);
		luis.addCarro(manzana);
		luis.addCarro(azucar);
		luis.addCarro(leche);
		
		Cliente martha = new Cliente(4);
		martha.addCarro(arroz);
		martha.addCarro(zanahoria);
		
		/**
		 * Se agregan los clientes a la lista de clientes
		 */
		clientes.add(sam);
		clientes.add(luis);
		clientes.add(pepe);
		clientes.add(martha);
		
		/**
		 * Funcion que se encarga de imprimir los resultados en la consola
		 */
		print(clientes);
		
		Cajero cajero1 = new Cajero(1, clientes);
		Cajero cajero2 = new Cajero(2, clientes);
		Cajero cajero3 = new Cajero(3, clientes);
		
		cajero1.start();
		cajero2.start();
		cajero3.start();
	}
	
	public static void print(ArrayList<Cliente> clientes) {
		int tiempoTotal = 0;
		double gastoTotal = 0.0;
		for (Cliente cliente : clientes) {
			double gastoCliente = 0.0;
			int tiempoCompra = 0;
			for (int i = 0; i < cliente.sizeCarro(); i++) {
				gastoCliente += cliente.getItem(i).getPrecio();
				tiempoCompra += cliente.getItem(i).getTiempoProceso();
			}
			System.out.println("El cliente tardo " + tiempoCompra + " segundos y gasto " + gastoCliente + " pesos");
			tiempoTotal += tiempoCompra;
			gastoTotal += gastoCliente;
		}
		System.out.println("\nEn total los clientes tardaron " + tiempoTotal + " segundos y el ingreso total fue de " + gastoTotal + " pesos\n");
	}
}
