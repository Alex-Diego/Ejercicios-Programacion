import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		String abc="abcdefghijklmnopqrstuvwxyz";
		
		System.out.println("Introduzta un Texto");
		String texto=teclado.nextLine();
		System.out.println("Introduzca la letra que desea poner en Mayusculas");
		String letra=teclado.next();
		letra=letra.toLowerCase();
	//	String comodin="";
		
		while (abc.indexOf(letra)==-1) {
			System.out.println("Porfavor, introduzca una letra correcta");
			letra=teclado.next();
		}
		System.out.println("La frase Final es:");
		Thread.sleep(1000);
		/*
		 * Opcion larga
		for (int i = 0; i < texto.length(); i++) {
			comodin=texto.substring(i, i+1);
			if (letra.equals(comodin)) {
				texto=texto.replace(comodin, comodin.toUpperCase());
			}
		}
		*/
		texto=texto.replaceAll(letra, letra.toUpperCase()); //Version corta
		System.out.println(texto);
		
		
	}

}
