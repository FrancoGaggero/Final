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





///////////////////// ADMINISTRADOR INGRESA A UN NUEVO CLIENTE
	public void RegistrarCliente () {
		////////INICIO VARIABLES
		String nombre="";
		String contra="";
		String usuario="";
		String []categoria = {
				"silver" , "gold", "black"
		};
		int cat=0;
		String categoriaf="";
		int nruCuenta=0;
		int tarjeta=0;
		int codigoseg=0;
		double saldo=0;
		
		//////////// INGRESO DATOS CLIENTE
		nombre = validarCaracteres("Ingrese nombre del nuevo cliente ");
		usuario= validarUsuario();
		contra= validarUsuario();
		nruCuenta= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de tarjeta"));
		
		
		////////SE CREO UN NUMERO AUTOMATICO DE TARJETA
		tarjeta= crearNumeroTarjeta();
		//////// SE CREA UN CODIGO DE SEGURIDAD AUTOMATICO
		codigoseg= crearCodSeguridad();
		
		cat= JOptionPane.showOptionDialog(null, "Seleccionar categoria de que será " + nombre, usuario, cat, nruCuenta, null, categoria, categoria[0]);
		switch (cat) {
		case 0:
			categoriaf="silver";
			break;
		case 1:
			categoriaf="gold";
			break;
		case 2:
			categoriaf="black";
			break;
		}
		
		////////////////////CREO EL OBJETO (NUEVO) DE LA CLASE CLIENTE Y OBJETO (NUEVA) DE LA CLASE CUENTA
		
			Cuenta nueva = new Cuenta (nruCuenta, saldo, tarjeta,codigoseg);
		
			Cliente nuevo = new Cliente (nombre, contra, usuario,categoriaf, nueva);
		
		
		

	
		
		
	}
	



	
	//////////////////////////////////////	VALIDAR NUMERO DE CUENTA CON POR LO MENOS 6 DIGITOS 

	public int crearNumeroTarjeta () {
		int numero= (int) Math.random()*99999+10000;
		
		return numero;
	}
	
	public int crearCodSeguridad () {
		int numero= (int) Math.random()*999*100;
		
		return numero;
	}
	

	
	/////////////////////////VALIDADOR PARA UN USURAIO CON MINIMO 6 CARACTERES Y POR LO MENOS UN NUMERO Y UNA MAYUSCULA 
	public  String validarUsuario () {
		boolean palabracorrecta=false;
		String user ="";
		
		do {	
			 user = JOptionPane.showInputDialog("Ingrese usuario" + "\n" + "(minimo 6 carac. 1 Mayúscula. 1 Número)");

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
				
		/////////////////////////////VALIDACION DE TODOS LOS REQUISITOS
			if (largo==true && upper==true && digit==true) {
				palabracorrecta=true;
			}
		} while (palabracorrecta==false);
		return user;
	}
		
///////////////////////////////////VALIDAR CONTRASEÑA
	public String validarContra(String mensaeje) {
		String palabra = "";
		while (palabra.equals("") || palabra.length()<10) {
			palabra = JOptionPane.showInputDialog(mensaeje);
		}
		
		return "";
	}
		
		
		
		



//////////////////////////////VALIDAR CARACTERES NORMAL
	public String validarCaracteres(String mensaeje) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaeje);
		}
		return palabra;
	}

}
