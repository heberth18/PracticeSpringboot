//A esta interfaz le vamos a dar los metodos del CRUD (tabla), para guardar, buscar, eliminar y modificar
package combolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import combolsadeideas.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> finbAll();

	//Metodos del CRUD 
	//Guardar, eliminar y buscar
	
	public Cliente FindById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
}
