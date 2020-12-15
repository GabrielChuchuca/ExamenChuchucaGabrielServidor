/**
 * 
 */
package ec.edu.ups.ExamenChuchucaGabrielServidor.on;

import javax.ejb.Local;

import ec.edu.ups.ExamenChuchucaGabrielServidor.modelo.*;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Local
public interface GestionUsuarioLocal {
	public void guardarCliente(Cliente c) throws Exception;

}
