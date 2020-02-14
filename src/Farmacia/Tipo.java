package Farmacia;

public enum Tipo {

	CORTICOESTEROIDE(13.9, 27.80), INHIBIDOR(1.86, 3.92), NARCOTICO(3.65, 7.29), ANTICONVULSIVO(1.56, 3.12),
	ANALGESICO(1.25, 2.5), ANTIFUNGICO(2.14, 4.28), HORMONAL(22.5, 45.), ANTIACIDO(2.14, 4.28),
	ANTIALERGICO(1.88, 3.95), LAXANTE(1.56, 3.12), ANTIINFECCIOSO(3.21, 6.42), ANTIINFLAMATORIO(0.95, 1.9),
	ANTIPERETICO(3.65, 7.29), ANTITUSIVO(1.56, 3.11), ANTIHISTAMINICO(1.56, 3.11), ANTIDEPRESIVO(1.52, 3.04);

	// atributs
	private double preuMax;
	private double preuMin;

	// setters i getters
	public double getPreuMax() {
		return preuMax;
	}

	public void setPreuMax(double preuMax) {
		this.preuMax = preuMax;
	}

	public double getPreuMin() {
		return this.preuMin;
	}

	public void setPreuMin(double preuMin) {
		this.preuMin = preuMin;
	}

	// constructor
	private Tipo(double preuMin, double preuMax) {
		this.preuMin = preuMin;
		this.preuMax = preuMax;
	}
}