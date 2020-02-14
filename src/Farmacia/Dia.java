package Farmacia;

public enum Dia {
	DILLUNS(22, 6), DIMARTS(22, 6), DIMECRES(22, 6), DIJOUS(22, 6), DIVENDRES(22, 6), DISSABTE(22, 6), DIUMENGE(22, 6);

// atributs
	private int horaMax;
	private int horaMin;

// setters i getters
	public int getHoraMax() {
		return horaMax;
	}

	public void setHoraMax(int horaMax) {
		this.horaMax = horaMax;
	}

	public int getHoraMin() {
		return this.horaMin;
	}

	public void setHoraMin(int horaMin) {
		this.horaMin = horaMin;
	}

// constructor
	private Dia(int horaMin, int horaMax) {
		this.horaMin = horaMin;
		this.horaMax = horaMax;
	}
}