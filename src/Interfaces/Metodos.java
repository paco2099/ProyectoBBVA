package Interfaces;

import java.util.List;

import ClaseNormal.Cliente;

//Interface --------- Plantilla para declarar funciones/metodos vacios/abstractos
public interface Metodos {
	//Guardar
	public void guardar(Cliente cliente);
	
	//Mostrar
	public List<Cliente> mostrar();
	
	//Buscar
	public Cliente buscar(int i);
	
	//Editar
	public void editar(int i, Cliente cliente);
	
	//Eliminar
	public void eliminar(int i);
	
}
