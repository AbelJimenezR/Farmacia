package Farmacia;

public class MedicamentoCon extends Medicamento{

	public MedicamentoCon() {
		// TODO Auto-generated constructor stub
	}

	public MedicamentoCon(String nom, Tipo tipo, String empresa, double precio) {
		super(nom, tipo, empresa, precio);
		// TODO Auto-generated constructor stub
	}
	
	
	public void setPreu() {
		
	}
	
	public double descuento() {
		
		return (float) (precio*50/100);
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Medicamento con receta: \n");
		sb.append("Artículo: " + nom + "\n");
		sb.append("Precio: " + precio + "\n");
		
		String result = sb.toString();
		return result;

		
	}

	
	

}
