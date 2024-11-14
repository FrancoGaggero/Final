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
		String nombre="";
		String contra="";
		String usuario="";
		String []categoria = {
				"silver" , "gold", "black"
		};
		int numeroCuenta= 0;
		
		
		

	
		
		//	Cliente nuevo = new Cliente ();
		
		
	}
	



	
	//////////////////////////////////////	VALIDAR NUMERO DE CUENTA CON POR LO MENOS 6 DIGITOS 

	public boolean validarNumeroCuenta (int numero) {
		
		String num= Integer.toString(numero);
		 
		if (num.length()>=5) {
			JOptionPane.showMessageDialog(null, "El numero de cuenta debe tener por lo menos 6 dígitos");
		}else {
			JOptionPane.showMessageDialog(null, "Numero de cuenta ingresado correctamente");
		}
		return true;
	}
	
	/////////////////////////VALIDADOR PARA UN USURAIO CON MINIMO 6 CARACTERES Y POR LO MENOS UN NUMERO Y UNA MAYUSCULA 
	public boolean validarUsuario (String user) {
		if (user.length()<=6) {
			JOptionPane.showMessageDialog(null, "El usuario debe tener por lo menos 6 dígitos");
			
			return false;
		}else {
			
				for (int i = 0; i < user.length(); i++) {
					if (Character.isDigit(user.charAt(i))) {
						return true;
					}
				}
			
			
		}
			
		
		
		return true;
	}
		
		
		
		




	public String validarCaracteres(String mensaej) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaej);
		}
		return palabra;
	}

}
