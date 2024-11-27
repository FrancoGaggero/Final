import java.util.LinkedList;

public class Cuenta {
	


	 private int nroCuenta;
	 private double saldo;
	 private int tarjeta;
	 private int codigoSeg;
	 private static LinkedList<Movimiento> movimientos;
	 
	public Cuenta(int nroCuenta, double saldo, int tarjeta,int codigoSeg) {
		super();
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
		this.tarjeta = tarjeta;
		this.codigoSeg= codigoSeg;
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}

	public int getCodigoSeg() {
		return codigoSeg;
	}

	public void setCodigoSeg(int codigoSeg) {
		this.codigoSeg = codigoSeg;
	}

	public static LinkedList<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(LinkedList<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
	 
	
	 

	

}
