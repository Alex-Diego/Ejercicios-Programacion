import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce un Nombre y Apellido");
		String nombre1=teclado.nextLine();
		System.out.println("Introduce otro Nombre y Apellido");
		String nombre2=teclado.nextLine();
		
		String nom1="";
		String nom2="";
		String ap1="";
		String ap2="";
		
		for (int i = 0; i < nombre1.length(); i++) {
			if (" ".indexOf(nombre1.substring(i, i+1))!=-1) {
				nom1=nombre1.substring(0, i);
				ap1=nombre1.substring(i);
			}
			
		}
		for (int i = 0; i < nombre2.length(); i++) {
			if (" ".indexOf(nombre2.substring(i, i+1))!=-1) {
				nom2=nombre2.substring(0, i);
				ap2=nombre2.substring(i);
			}
			
		}
		nom1=nom1.concat(ap2);
		nom2=nom2.concat(ap1);
		
		System.out.println(nom1);
		System.out.println(nom2);
	}

}
