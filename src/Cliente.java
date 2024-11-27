
public class Cliente extends Usuario {
	
	
	private String categoria;
	Cuenta cuenta;

	public Cliente(String nombre, String contra, String usuario, String categoria, Cuenta cuenta) {
		super(nombre, contra, usuario);
		 this.categoria= categoria;
	}
	
	
	public Cliente() {
		
		 this.categoria= "null";
	}
	
	


	
	public void transferir () {
		
		
		
	}
	
	
	
	

}
