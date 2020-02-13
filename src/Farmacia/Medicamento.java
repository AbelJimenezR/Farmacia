package Farmacia;

import java.util.Scanner;

public abstract class Medicamento {
		 protected String nom;
		 protected Tipo tipo;
		 protected String Empresa;
		// protected boolean receta;
		 protected Double precio;
			//double precioFinal;

		 
	
	public Medicamento() {
				
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Medicamento(String nom, Tipo tipo, String empresa,  Double precio) {
		this.nom = nom;
		this.tipo = tipo;
		Empresa = empresa;
		this.precio=precio;
		//this.receta = receta;
	}

	@Override
	public String toString() {
		return "Medicamento [nom=" + nom + ", tipo=" + tipo + ", Empresa=" + Empresa + ", precio=" + precio + "]";
	}

	public static void nouMedicament() {
		Scanner sc=new Scanner(System.in);
		String medicament;
		
		System.out.println("Nom: ");
		String nom=sc.nextLine();
		System.out.println("Tipus: ");
		String tipus=sc.nextLine();
		System.out.println("Empresa: ");
		String empresa=sc.nextLine();
		System.out.println("Preu: ");
		double preu=sc.nextDouble();
		System.out.println("Recepta: ");
		Integer recepta=sc.nextInt();
		
		medicament=""+nom+","+tipus+","+empresa+","+preu+","+recepta;
		
		Utilitat.cargaMedicamentos(medicament);

	}
	

	public static void veureMedicament(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Introdueix el nom del medicament: ");
		String nom=sc.nextLine();
		System.out.println(Utilitat.compruebaMedicamento(nom).toString());

		
	}
	

	}
	


