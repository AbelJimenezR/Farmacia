package Farmacia;

public class Empleado extends Persona implements Sou{

	public double sou;
	
	public Empleado() {
		super();
	}

	public Empleado(String nom, String cognom, String contra) {
		super(nom, cognom, contra);
		sou(40);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getContra() {
		return contra;
	}

	@Override
	public void sou(double hores) {
		this.sou=hores*6.5;
	}

	@Override
	public void souGuardia(double hores) {
	}

}