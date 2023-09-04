package examen;

import java.util.Scanner;

public class Main
{
	public static void main (String[] args)
	{
		Ejecucion ejecucion = new Ejecucion ();
		
		Extra extra = new Extra ();
		
		ejecucion.IniciarPrograma ();
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("¿Imprimir metodo FizzBuzz? (Si/No):");
		
		String opcion = scanner.nextLine ().toLowerCase().trim ();
	
		if (opcion.equals("si"))
		{
			extra.crearFizzBuzz();
		}
		else;
		{
			System.out.print("¡Hasta pronto!");
		}
		scanner.close ();
	}
}