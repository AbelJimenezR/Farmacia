package Farmacia;

public class MedicamentoSin extends Medicamento implements Pepe{
	public MedicamentoSin() {
		// TODO Auto-generated constructor stub
	}

	public MedicamentoSin(String nom, Tipo tipo, String empresa, double precio) {
		super(nom, tipo, empresa, precio);
		this.precio=precio;
	}

	
	
	@Override
	public double descuento() {
			return (float) (precio*50/100);			
		}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Medicamento sin receta: \n");
		sb.append("Artículo: " + nom + "\n");
		sb.append("Precio: " + precio + "\n");
		
		String result = sb.toString();
		return result;
		
	}


	
}
