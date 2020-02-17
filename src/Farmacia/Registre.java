package Farmacia;

import java.util.ArrayList;

public class Registre<T> {
	
	private ArrayList<T> t = new ArrayList<T>();

	public void add(T t) {
		this.t.add(t);
	}

	@Override
	public String toString() {
		return "Registre [t=" + t + "]";
	}

}