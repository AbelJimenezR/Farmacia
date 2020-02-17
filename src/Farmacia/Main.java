package Farmacia;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		Utilitat.cargaMedicamentos();
		Utilitat.cargaEmpleados();
		Utilitat.afegirMedicamentsRegistre();
		Utilitat.afegirUsuarisRegistre();
		Menu.menuPrincipal();
	}		
}	