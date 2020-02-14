package Farmacia;

public class EmpleadoGuardia extends Persona implements Sou{
	
	private Dia d;
	private double souG;
	
	public EmpleadoGuardia(String nom, String cognom, String contra) {
		super(nom, cognom, contra);
		d = Dia.DISSABTE;
		souGuardia(8);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getContra() {
		return contra;
	}

	@Override
	public void sou(double hores) {
	}

	@Override
	public void souGuardia(double hores) {
		this.souG=hores*10.5;
	}

}