/**
 * 
 */
package ec.edu.ups.ExamenChuchucaGabrielServidor.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ExamenChuchucaGabrielServidor.modelo.Cliente;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class ClienteDAO {
	
	//Atributo de la clase
	@PersistenceContext(name = "ExamenChuchucaGabrielServidorPersistenceUnit") 
	private EntityManager em;
	
	/** 
	 * Metodo que permite registrar un cliente en la base de datos
	 * @param c Cliente que se va a registrar en la base
	 */
	public void insert(Cliente c) {
		em.persist(c);
	}
	
	/** 
	 * Metodo que permite actualizar un cliente en la base de datos
	 * @param c Cliente que se va a actualizar en la base
	 */
	public void update(Cliente c) {
		em.merge(c);
	} 
	
	/** 
	 * Metodo que permite obtener un cliente de la base de datos
	 * @param cedulaCliente Cedula que se utilizara para obtener el cliente
	 * @return un cliente que se encuentre registrado en la base
	 */
	public Cliente read(String cedulaCliente) {
		return em.find(Cliente.class, cedulaCliente);
	} 
	
	/** 
	 * Metodo que permite eliminar un cliente de la base de datos
	 * @param cedulaCliente Cedula utilizaremos para poder eliminar el cliente
	 */
	public void delete(String cedulaCliente) {
		Cliente c = read(cedulaCliente);
		em.remove(c);
	}
	
	/** 
	 * Metodo que permite obtener los clientes que estan registrados en la base de datos
	 * @return Lista de clientes que estan registrados en la base de datos
	 */
	public List<Cliente> getClientes() {
		String jpql = "SELECT c FROM Cliente c ";

		Query q = em.createQuery(jpql, Cliente.class);
		return q.getResultList();
	} 
}
