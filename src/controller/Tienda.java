package controller;

import java.util.ArrayList;

import model.Bolsa;
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
		
		Cliente rodrigo = new Cliente(5);
		rodrigo.addCarro(leche);
		rodrigo.addCarro(zanahoria);
		rodrigo.addCarro(huevo);
		
		Cliente angel = new Cliente(6);
		angel.addCarro(sal);
		angel.addCarro(pan);
		
		Cliente sergio = new Cliente(7);
		sergio.addCarro(maiz);
		sergio.addCarro(frijol);
		
		Cliente rudy = new Cliente(8);
		rudy.addCarro(frijol);
		
		Cliente humberto = new Cliente(9);
		humberto.addCarro(leche);
		humberto.addCarro(azucar);
		humberto.addCarro(arroz);
		
		Cliente armando = new Cliente(10);
		armando.addCarro(zanahoria);
		armando.addCarro(azucar);
		armando.addCarro(manzana);
		armando.addCarro(maiz);
		
		/**
		 * Se agregan los clientes a la lista de clientes
		 */
		clientes.add(sam);
		clientes.add(pepe);
		clientes.add(luis);
		clientes.add(martha);
		clientes.add(rodrigo);
		clientes.add(angel);
		clientes.add(sergio);
		clientes.add(rudy);
		clientes.add(humberto);
		clientes.add(armando);
		
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
		Bolsa bolsaTotal = new Bolsa();
		for (Cliente cliente : clientes) {
			int tiempoCompra = 0;
			Bolsa bolsaCliente = new Bolsa();
			for (int i = 0; i < cliente.sizeCarro(); i++) {
				bolsaCliente.depositar(cliente.getItem(i).getPrecio());
				tiempoCompra += cliente.getItem(i).getTiempoProceso();
			}
			System.out.println("El cliente " + cliente.getId() + " tardo " + tiempoCompra + " segundos y gasto " + bolsaCliente.consulta() + " pesos");
			tiempoTotal += tiempoCompra;
			bolsaTotal.depositar(bolsaCliente);
		}
		System.out.println("\nEn total los clientes tardaron " + tiempoTotal + " segundos y el ingreso total fue de " + bolsaTotal.consulta() + " pesos\n");
	}
}
