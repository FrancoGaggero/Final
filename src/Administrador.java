import javax.swing.JOptionPane;

public class Administrador extends Usuario {

	private int idEmpleado;
	
	public Administrador(String nombre, String contra, String usuario,int idEmpleado) {
		super(nombre, contra, usuario);
		this.idEmpleado=  idEmpleado;
	}

	
	public int getIdEmpleado() {
		return idEmpleado;
	}

	




	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}











	public void RegistrarCliente () {
		String []categoria = {
				""
		};

		
	}










	public String validarCaracteres(String mensaej) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaej);
		}
		return palabra;
	}

}
