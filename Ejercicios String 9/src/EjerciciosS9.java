import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS9 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Por favor, introduzca el numero de personas que vas a introducir");
		int personas= teclado.nextInt();
		Thread.sleep(1000);
		int a�o=0;
		String sexo="";
		int curso=0;
		String extra;
		String matriz[]= new String [personas];
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("Introduzca el a�o de la persona " +(i+1));
			a�o=teclado.nextInt();
			if (a�o==00000000) {
				break;
			}
			while (!(a�o<1990||a�o>1995)) {
				System.out.println("Por favor que al a�o de la persona se entre 1990 y 1995");
				a�o=teclado.nextInt();
			}
			matriz[i]=matriz[i] + a�o;
			System.out.println("La persona "+(i+1)+" es Hombre (H) o Mujer (M)");
			sexo=teclado.nextLine();
			while (!(sexo.equals("H")||sexo.equals("h")||sexo.equals("M")||sexo.equals("m"))) {
				System.out.println("Por favor, introduzca H o una M");
				sexo=teclado.nextLine();
				sexo = sexo.toUpperCase();
			}
			matriz[i]=matriz[i] + sexo;
			System.out.println("Introduzca el curso de la persona "+(i+1));
			curso=teclado.nextInt();
			while (!(a�o<0||a�o>2)) {
				System.out.println("Por favor introduze si esta en el curso 1 o en el curso 2");
				curso=teclado.nextInt();
			}
			matriz[i]=matriz[i] + curso;
			System.out.println("Introduce dos numeros o letras mas");
			extra=teclado.nextLine();
			while (extra.length()>2) {
				System.out.println("Por favor introduce solo dos caracteres");
				extra=teclado.nextLine();
			}
			matriz[i]=matriz[i] + extra;
			}
		
		
		
		
	}

}
