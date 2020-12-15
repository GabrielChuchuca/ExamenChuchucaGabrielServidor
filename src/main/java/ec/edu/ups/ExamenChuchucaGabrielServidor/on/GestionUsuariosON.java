/**
 * 
 */
package ec.edu.ups.ExamenChuchucaGabrielServidor.on;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.ExamenChuchucaGabrielServidor.dao.ClienteDAO;
import ec.edu.ups.ExamenChuchucaGabrielServidor.modelo.Cliente;
import ec.edu.ups.ExamenChuchucaGabrielServidor.on.GestionUsuarioLocal;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class GestionUsuariosON implements GestionUsuarioLocal{
	
	@Inject
	private ClienteDAO clienteDAO;
	
	/**
	 * Metodo que me permite guardar el cliente en la base de datos
	 * 
	 * @param c Cliente que se guarda en la base de datos
	 * @throws Exception 
	 */
	public void guardarCliente(Cliente c) throws Exception {
		try {
			clienteDAO.insert(c);
		} catch (Exception e) {
			throw new Exception("ERROR AL CREAR");
		}
	}
	
	

}
