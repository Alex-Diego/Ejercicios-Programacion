import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduzta una palabra");
		String texto=teclado.nextLine();
		String texto2="";
		
		for (int i = texto.length(); i >0 ;i--) {
			texto2=texto2.concat(texto.substring(i-1, i));
		}
		texto=texto.toLowerCase();
		texto2=texto2.toLowerCase();
		texto=texto.replaceAll(" ", "");
		texto2=texto2.replaceAll(" ", "");
		if (texto.equals(texto2)) {
			System.out.println("La palabra es palindroma");
		}else{
			System.out.println("La palabra no es palindroma");
		}
		
	}

}
