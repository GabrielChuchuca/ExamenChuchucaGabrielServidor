/**
 * 
 */
package ec.edu.ups.ExamenChuchucaGabrielServidor.vista;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import javax.faces.context.FacesContext;

import javax.faces.application.FacesMessage;
import ec.edu.ups.ExamenChuchucaGabrielServidor.modelo.Cliente;
import ec.edu.ups.ExamenChuchucaGabrielServidor.on.GestionUsuarioLocal;

/**
 * @author Gabriel Leonardo Chu
 *
 */


@ManagedBean
@SessionScoped
public class CrearClienteBean {
	
	@Inject
	private GestionUsuarioLocal gestionUsuarios;
	private Cliente cliente;
	
	@PostConstruct
	private void iniciar() {
		cliente = new Cliente();
	}

	public GestionUsuarioLocal getGestionUsuarios() {
		return gestionUsuarios;
	}

	public void setGestionUsuarios(GestionUsuarioLocal gestionUsuarios) {
		this.gestionUsuarios = gestionUsuarios;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * Metodo que permite guardar un cliente con sus respectivos atributos
	 * 
	 * @return Nulo
	 */
	public String crearCliente() {
		try {
			gestionUsuarios.guardarCliente(cliente);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

}
