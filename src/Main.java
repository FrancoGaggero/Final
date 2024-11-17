import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Administrador yo = new Administrador("franco gaggero","00", "fran", 1);
		
		JOptionPane.showMessageDialog(null, "hola");
		
	
		
		int opcion=0;	
		int opcionAdmin=0;
		
		do {
			
			opcion= JOptionPane.showOptionDialog(null, "", null, 0, 0, null, Menuprincipal.values(), Menuprincipal.values()[0]);
			
			switch (opcion) {
			////////////LOGIN ADMIN
			case 0:
				
				String usuario= validador(JOptionPane.showInputDialog("Ingrese usuario"));
				String contraseña = validador(JOptionPane.showInputDialog("Ingrese contraseña"));
				
				if (yo.IniciarSesion(usuario, contraseña)) {
					opcionAdmin= JOptionPane.showOptionDialog(null, "", null, 0, 0, null, MenuAdmin.values(), MenuAdmin.values()[0]);		
					do {
						
					
					switch (opcionAdmin) {
			////////////////////// REGISTRAR NUEVO CLIENTE 
					case 0:
				
						yo.RegistrarCliente();
						
						break;
			//////////////////////////// VER MOVIMIENTOS	
					case 1:
		
						break;
					case 2:
						
						break;
					}
					
					} while (opcionAdmin!=2);
					
					
					
				}else {
					
					JOptionPane.showMessageDialog(null, "le erraste capo");
				}
				
				
				break;
				//////////LOGIN CLIENTE
			case 1:
				
				
				
				break;
				
	///////////////////////SALIR
			case 2:
			
			
			
			break;

			
				
				
			}
		
			
			
		} while (opcion!=2);
	
	
	}	
///////////////////////////// FUNCIONES PARA EL MAIN

	public static String validador (	String x) {
		if (x.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Campo vacio");
		}
		return x;
	}
	
	
	
	
}
