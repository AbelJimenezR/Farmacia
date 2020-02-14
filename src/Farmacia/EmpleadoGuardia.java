package Farmacia;

public class EmpleadoGuardia extends Persona {
	
	private Dia d;
	
	public EmpleadoGuardia(String nom, String cognom, String contra) {
		super(nom, cognom, contra);
		d = Dia.DISSABTE;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContra() {
		return contra;
	}

}