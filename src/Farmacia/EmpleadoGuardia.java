package Farmacia;


public class EmpleadoGuardia extends Persona{
	
	public EmpleadoGuardia(String nom, String cognom, String contra) {
		super(nom, cognom, contra);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getContra() {
		return contra;
	}
	
}