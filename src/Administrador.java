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
		
		nombre = JOptionPane.showInputDialog("Ingrese nombre del nuevo cliente del banco");
		
		
		
		

	
		
		//	Cliente nuevo = new Cliente ();
		
		
	}
	



	
	//////////////////////////////////////	VALIDAR NUMERO DE CUENTA CON POR LO MENOS 6 DIGITOS 

	public boolean validarNumeroCuenta (int numero) {
		
		String num= Integer.toString(numero);
		 
		if (num.length()<10) {
			JOptionPane.showMessageDialog(null, "El numero de cuenta debe tener por lo menos 10 dígitos");
		}else {
			JOptionPane.showMessageDialog(null, "Numero de cuenta ingresado correctamente");
		}
		return true;
	}
	

	
	/////////////////////////VALIDADOR PARA UN USURAIO CON MINIMO 6 CARACTERES Y POR LO MENOS UN NUMERO Y UNA MAYUSCULA 
	public  String validarUsuario () {
		boolean palabracorrecta=false;
		String user ="";
		do {
			
			 user = JOptionPane.showInputDialog("Ingrese usuario");

			boolean largo=false;
			if (user.length()<6) {
				JOptionPane.showMessageDialog(null, " El usuario debe tener al menos 6 caracteres ");
			}else {
				largo=true;
			}
			
			/////////////////////////DÍGITO
			
			boolean digit=false;
			for (int i = 0; i < user.length(); i++) {
				if (Character.isDigit(user.charAt(i))) {
					
					digit=true;
				}

			}
				if (digit==false) {
					JOptionPane.showMessageDialog(null, "No tiene numero");
				}
			////////////////////////// MAYÚSCULA
			boolean upper=false;
			for (int i = 0; i < user.length(); i++) {
				if (Character.isUpperCase(user.charAt(i))) {
					
					upper=true;
				}
			}
				
				if (upper==false) {
					JOptionPane.showMessageDialog(null, "No tiene letra mayuscula");
				}
				
			
			if (largo==true && upper==true && digit==true) {
				palabracorrecta=true;
			}
		} while (palabracorrecta==false);
		
		
		
		return user;
	}
		

		
		
		
		



//////////////////////////////VALIDAR CARACTERES NORMAL
	public String validarCaracteres(String mensaej) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaej);
		}
		return palabra;
	}

}
