package Farmacia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Utilitat {
	
	static HashMap<Integer, Medicamento> medicamentos = new HashMap<Integer, Medicamento>();

	public static void cargaMedicamentos() {
		String fichero = "/home/abel/Escriptori/med.txt";
int s=0;
		try {
			FileReader fr = new FileReader(fichero);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";

			while ((linea = br.readLine()) != null) {
				medicamentos.put(s,lini(linea));
				s++;
			}

			fr.close();
		} catch (Exception e) {
			System.out.println("Excepcion leyendo fichero " + fichero + ": " + e);
		}
	}
	
	public static void cargaMedicamentos(String med) {
				medicamentos.put(1,lini(med));
	}

	public static Medicamento lini(String linia) {

		List<String> meda = Arrays.asList(linia.split(","));
		Medicamento medi = null;

		for (Tipo tmp : Tipo.values()) {
			if (meda.get(4).equals("0")) {
				if (meda.get(1).equalsIgnoreCase(tmp.name())) {
					medi = new MedicamentoSin(meda.get(0), Tipo.valueOf(tmp.toString()), meda.get(2),
							Double.valueOf(meda.get(3)));
				}
			} else  {
				if (meda.get(1).equalsIgnoreCase(tmp.name())) {
					medi = new MedicamentoCon(meda.get(0), Tipo.valueOf(tmp.toString()), meda.get(2),
							Double.valueOf(meda.get(3)));
				}
			}
		}
		return medi;

	}

	public static Medicamento compruebaMedicamento(String medicamento) {
		//Medicamento num=null;
		for (Medicamento med : medicamentos.values()) {
			if (med.getNom().toUpperCase().equals(medicamento.toUpperCase())) {
				return med;
				//num = medicamentos.get(num);
			}
		}
		return null;
	}

}
