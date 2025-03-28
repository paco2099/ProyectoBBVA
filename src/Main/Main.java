package Main;

import ClaseNormal.Cliente;
import Implementacion.LogicaMetodos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear objetos
		Cliente c1 = new Cliente(2, "Javier", 264846562, "javier@gmail.com");
		Cliente c2 = new Cliente(3, "Francisco", 561498006, "francisco@gmail.com");
		
		//Instanciar la Clase con la Logica
		LogicaMetodos imp = new LogicaMetodos();
		
		//Guardar
		imp.guardar(c1);
		imp.guardar(c2);
		
		//Mostar
		System.out.println(imp.mostrar());
		
		//Buscar
		System.out.println("Se encontró: ");
		System.out.println(imp.buscar(1));
		
		//Editar
		imp.editar(0, c2);
		
		//Eliminar
		imp.eliminar(0);
	}

}
