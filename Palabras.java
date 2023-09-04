package examen;

public class Palabras
{
	private String cadena;
	
	public Palabras (String cadena)
	{
		this.cadena = cadena;
	}
	public void convertirPrimeraMayuscula ()
	{ 
		char[] charArray = cadena.toCharArray ();
		charArray [0] = Character.toUpperCase (charArray[0]);
		System.out.println (new String (charArray));
	}
	public void invertirCadena ()
	{
		StringBuilder reversed = new StringBuilder (cadena) .reverse();
		System.out.println (reversed.toString());
	}
	public void convertirVocalesMayuscula()
	{
		String result = cadena.replaceAll("[aeiouAEIOU]", "$0") .toUpperCase();
		System.out.println (result);
	}
	public void checarPalindromo()
	{
		String cleanStr = cadena.replaceAll ("[^a-zA-Z]", "") .toLowerCase ();
		String reversedStr = new
		StringBuilder (cleanStr) .reverse () .toString();
		if (cleanStr.equals (reversedStr))
		{
			System.out.println("\"" + cadena + "\" Es un palíndromo.");
		}
		else
		{
			System.out.println("\"" + cadena + "\" No es un palíndromo.");
		}
	}
}



