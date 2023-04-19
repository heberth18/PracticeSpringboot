package combolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import combolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import combolsadeideas.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	// @Autowired sirve para identificar una clase importante
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	//El metodo finnAll es para obtener todos los registros de la tabla cliente
	public List<Cliente> finbAll() {
		return (List<Cliente>) clienteDao.findAll();
	} 

	@Override
	@Transactional(readOnly = true)
	public Cliente FindById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
	}
	
}
