import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS8 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Por favor introduzca un texto sin caracteres especiales ni tildes");
		String texto=teclado.nextLine();
		texto=texto.toUpperCase();
		String codificado="";
		
		String textocod;
		int posicion=0;
		String opcion;
		String abecedario=" XYZABCDEFGHIJKLMN�OPRSTUVWXYZ";
		System.out.println("Codificando");
		Thread.sleep(1000);
		for (int i = 0; i < texto.length(); i++) {
			posicion=abecedario.indexOf(texto.substring(i, i+1));
			if (posicion ==0) {
				codificado = codificado +" ";
			}
			
			if (posicion >0) {
				codificado=codificado.concat(abecedario.substring(posicion+3,posicion +4));
			}
		}
		textocod=codificado;
		System.out.println("Se ha codificado");
		Thread.sleep(1000);
		System.out.println(codificado);
		Thread.sleep(1000);
		System.out.println("Desea Decodificarlo, SI o NO?");
		Thread.sleep(1000);
		opcion=teclado.next();
		codificado="";
		if (opcion.equals("S")|| opcion.equals("SI") || opcion.equals("s")|| opcion.equals("si")) {
			for (int i = 0; i < textocod.length(); i++) {
				posicion=abecedario.indexOf(textocod.substring(i, i+1));
				if (posicion ==0) {
					codificado = codificado +" ";
				}
				if (posicion ==1) {
					codificado = codificado +"U";
				}
				if (posicion ==2) {
					codificado = codificado +"V";
				}
				
				if (posicion ==3) {
					codificado = codificado +"W";
				}
				if (posicion >3) {
					codificado=codificado.concat(abecedario.substring(posicion-3,posicion -2));
				}
				
			}
			System.out.println("El texto decodificado es "+codificado);
			System.out.println("Gracias por utilizar la codificacion CESAR");
		}
		if (opcion.equals("N")|| opcion.equals("NO") || opcion.equals("n")|| opcion.equals("no")) {
			System.out.println("Gracias por utilizar la codificacion CESAR");
		}
		
		
	}

}
