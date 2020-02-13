package Farmacia;

public class Empleado extends Persona {
	
	public Empleado() {
		super();
	}
			
	public Empleado(String nom, String cognom, String contra) {
		super(nom, cognom, contra);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getContra() {
		return contra;
	}
	
	
}