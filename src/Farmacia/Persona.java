package Farmacia;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Persona {
	public static HashSet<Persona> emple = new HashSet<Persona>();

	protected String nom;
	protected String cognom;
	protected String contra;
	
	public Persona() {
		
	}
	
	public Persona(String nom, String cognom, String contra) {
		this.nom=nom;
		this.cognom=cognom;
		this.contra=contra;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", cognom=" + cognom + ", tarSan=" + contra + "]";
	}
	
	public abstract String getContra();
	
	public static Persona comprovaVenedor() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Identificat introduint la teva contrasenya: ");
		String ident = sc.next();
		Iterator<Persona> i = emple.iterator();
		while(i.hasNext()) {
			Persona e = i.next();
			if(ident.compareTo(e.getContra())==0) {
				return e;
			}
		}
		return null;
	}
	
	
	public static void nouUsuari() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nom: ");
		String nom =  sc.next();
		System.out.println("Cognom: ");
		String cognom =  sc.next();
		System.out.println("Contrasenya: ");
		String contra =  sc.next();
		System.out.println("Introdueix 1 si ets Empleat i 2 si ets Empleat de Guardia");
		int a = sc.nextInt();
		if(a==1) {
			Persona e = new Empleado(nom,cognom,contra);
			emple.add(e);
		}else if(a==2) {
			Persona e = new EmpleadoGuardia(nom,cognom,contra);
			emple.add(e);
		}
		
	}
	
	public static void modificaUsuari() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introdueix la teva contrasenya: ");
		
		String contra =  sc.next();
		System.out.println("Nom nou: ");
		String nom =  sc.next();
		System.out.println("Cognom nou: ");
		String cognom =  sc.next();

		System.out.println("Introdueix 1 si ets Empleat i 2 si ets Empleat de Guardia");
		int a = sc.nextInt();
		Iterator<Persona> i = emple.iterator();
		while(i.hasNext()) {
			
			Persona e = i.next();
			emple.remove(e);
			if(contra.compareTo(e.getContra())==0) {
				if(a==1) {
					Persona e2 = new Empleado(nom,cognom,contra);
					emple.add(e2);
				}else if(a==2) {
					Persona e2 = new EmpleadoGuardia(nom,cognom,contra);
					emple.add(e2);
				}
			}
		}
		
	}
}