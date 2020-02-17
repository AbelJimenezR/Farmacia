package Farmacia;

public class MedicamentoCon extends Medicamento implements Cloneable {

	public MedicamentoCon() {
	}

	public MedicamentoCon(String nom, Tipo tipo, String empresa, double precio) {
		super(nom, tipo, empresa, precio);
	}

	public void setPreu() {

	}

	public double descuento() {

		return (float) (precio * 50 / 100);

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

	@Override
	public MedicamentoCon clone() {
		MedicamentoCon clon = new MedicamentoCon(this.nom, this.tipo, this.empresa, this.precio);
		return clon;
	}

}