import java.util.LinkedList;

public class Usuario {
	private String nombre;
	private String contra;
	private String usuario;
	private LinkedList<Cliente>personas; 
	
	
	
	
	public Usuario(String nombre, String contra, String usuario) {
		super();
		this.nombre = nombre;
		this.contra = contra;
		this.usuario = usuario;
	}

	
	/////////////////////GET Y SER PARA LA LISTA 

	public LinkedList<Cliente> getPersonas() {
		return personas;
	}




	public void setPersonas(LinkedList<Cliente> personas) {
		this.personas = personas;
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getContra() {
		return contra;
	}


	public void setContra(String contra) {
		this.contra = contra;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	//////////////////
	public boolean IniciarSesion(String usuario,String contraseña) {
		if (this.usuario.equals(usuario) && this.contra.equals(contraseña)) {
			return true;
		} else {
			return false;
		}
	}
	

}
