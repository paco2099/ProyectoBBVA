package Implementacion;

import java.util.ArrayList;
import java.util.List;

import ClaseNormal.Cliente;
import Interfaces.Metodos;

public class LogicaMetodos implements Metodos{
	
	private List<Cliente> lista = new ArrayList<Cliente>();

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		lista.add(cliente);
	}

	@Override
	public List<Cliente> mostrar() {
		List<Cliente> listaN = new ArrayList<Cliente>();
		listaN = lista;
		return listaN;
	}

	@Override
	public Cliente buscar(int i) {
		Cliente clienteBuscado = null;
		clienteBuscado = lista.get(i);
		return clienteBuscado;
	}

	@Override
	public void editar(int i, Cliente cliente) {
		Cliente clienteEditadoCliente = buscar(i);
		//Logica para editar
		lista.set(i, clienteEditadoCliente);
	}

	@Override
	public void eliminar(int i) {
		lista.remove(i);
	}

}
