package examen;

import java.util.Scanner;

class Ejecucion
{
	public void IniciarPrograma()
	{
		Extra extra = new Extra ();
		Palabras palabra1 = new Palabras ("hasta luego cocodrilo");
		Palabras palabra2 = new Palabras ("anita lava la tina");
		
		System.out.println ("Para la primer oracion: hasta luego cocodrilo");
		System.out.println ("Cambiar la primer letra a mayúscula: ");
		palabra1.convertirPrimeraMayuscula();
		System.out.println ("Invertir la oración: ");
		palabra1.invertirCadena();
		System.out.println ("Cambiar las vocales en mayúsculas: ");
		palabra1.convertirVocalesMayuscula();
		palabra1.checarPalindromo();
		
		System.out.println ("Para la segunda oracion: anita lava la tina");
		System.out.println ("Cambiar la primer letra a mayúscula: ");
		palabra2.convertirPrimeraMayuscula();
		System.out.println ("Invertir la oración: ");
		palabra2.invertirCadena();
		System.out.println ("Cambiar las vocales en mayúsculas: ");
		palabra2.convertirVocalesMayuscula();
		palabra2.checarPalindromo();
		
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
