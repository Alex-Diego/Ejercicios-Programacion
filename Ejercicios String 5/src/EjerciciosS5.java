import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		String texto=teclado.nextLine();
		int comodin=0;
		String cadPar="";
		String cadImp="";
		String comodin1="";
		while  (comodin <1){
			if (texto.length()>80) {
				System.out.println("Por favor , Introduzca un texto de menos de 80 caracteres");
				texto=teclado.nextLine();
			}
			if (texto.length()<80) {
				comodin=1;
			}
		}
		for (int i = 0; i < texto.length(); i++) {
			if (i%2==0) {
				comodin1=texto.substring(i, i+1);
				cadPar=cadPar.concat(comodin1);
			}else{
				comodin1=texto.substring(i, i+1);
				cadImp=cadImp.concat(comodin1);
			}
		}
		System.out.println(cadPar +" Son las letras en los lugares pares");
		System.out.println(cadImp +" Son las letras en los lugares impares");
	}

} 
