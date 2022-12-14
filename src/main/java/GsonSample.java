import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class GsonSample {

	public static void main(String[] args) {
			boolean comprobante = false;
			String nombre;
			String apellidos;
			int edad = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" Introduzca sus datos:");
			
			do {
				System.out.println("Nombre:");
				nombre = sc.nextLine();
			} while (nombre == "");
			System.out.println("Nombre introducido: " + nombre + "\n");
			
			
			do {
				System.out.println("Apellidos:");
				apellidos = sc.nextLine();
			} while (apellidos == "");
			System.out.println("Apellidos introducidos: " + apellidos + "\n");
			
			
			do {
				System.out.println("Edad:");
				try { 
					edad = Integer.parseInt(sc.nextLine());
					comprobante = true;
				} catch(Exception e) { 
					comprobante = false;
				}
			} while (!comprobante);
			System.out.println("Edad introducida: " + edad + "\n");
			
			
			Persona p = new Persona(nombre, apellidos, edad);
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json = gson.toJson(p);
			
			
			System.out.println("\n" + json);
			sc.close();
		}
		

	}

