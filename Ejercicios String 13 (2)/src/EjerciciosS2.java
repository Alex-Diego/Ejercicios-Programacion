import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS2 {

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
		System.out.println("Introduzca la letra que desea eliminar 3 veces");
		String letra=teclado.next();
		letra=letra.toLowerCase();
		texto=texto.toLowerCase();
		
		while (abc.indexOf(letra)==-1) {
			System.out.println("Porfavor, introduzca una letra correcta");
			letra=teclado.next();
		}
		System.out.println("La frase Final es:");
		Thread.sleep(1000);
		
		for (int i = 0; i < 3; i++) {			
				texto=texto.replaceFirst(letra, "");			
		}
		System.out.println(texto);
		
	}

}
