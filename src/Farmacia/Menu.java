package Farmacia;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
	public static int opcio;
	public static Scanner sc=new Scanner(System.in);

	public static void menuPrincipal() throws FileNotFoundException {
	do {
		System.out.println("Tria una opció:");
		System.out.println("1 - Usuaris");
		System.out.println("2 - Medicaments");
		System.out.println("3 - Venda");
		System.out.println("4 - Sortir");
		opcio=sc.nextInt();
		
			switch(opcio) {
			case 1:
				Menu.menuUsuari();
				break;
			
			case 2:
				Menu.menuMedicaments();
				break;
				
			case 3:
				Ticket.venda();
				break;
				
			case 4:
				System.out.println("Fins aviat!");
				System.exit(0);
				break;
				
			default:
					System.out.println("Torna a intentar-ho.");
				
			}
		}while(opcio>0||opcio<5);
		
	}

		public static void menuMedicaments() {
			Scanner sc=new Scanner(System.in);
			int x=0;

			do {
			System.out.println("Tria una opció:");
			System.out.println("1 - Nou Medicament");
			System.out.println("2 - Veure Medicament");
			System.out.println("0 - Tornar");

			int opcio=sc.nextInt();
			
				switch(opcio) {
				case 1:
					Medicamento.nouMedicament();
					break;
				
				case 2:
					Medicamento.veureMedicament();
					break;
				
				case 0:
					x=1;
				}
			
		}while(x==0);
			
		}	
		
		public static void menuUsuari() throws FileNotFoundException {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Tria una opcio:");
			System.out.println("1 - Nou usuari");
			System.out.println("2 - Modifica usuari");
			System.out.println("3 - Torna al menu anterior");
			int opcio=sc.nextInt();
			
			do {
				switch(opcio) {
				case 1:
					Persona.nouUsuari();
					break;
			
				case 2:
					Persona.modificaUsuari();
					break;
				
				case 3:
					Main.main(null);
					break;
				default:
					System.out.println("Torna a intentar-ho.");
				}
				
			}while (opcio > 0 && opcio < 4);
			
		}
		
		
}


