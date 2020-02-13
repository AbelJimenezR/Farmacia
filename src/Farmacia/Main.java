package Farmacia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(System.in);
		Utilitat.cargaMedicamentos();

		Persona per1= new Empleado("Abel", "Jimenez", "a");
		Persona.emple.add(per1);
		Menu.menuPrincipal();
	}
	

	
	
	
}
	