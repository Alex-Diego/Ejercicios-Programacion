import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosS9Op2 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String codigo;
		int comodin=0;
		int a�o;
		int bucle2=0;
		int bucle=0;
		String sexo;
		int clase;
		String cerrar="00000000";
		int sexotip=0;
		int i=0;
		int error=0;
		int correcto=0;
		int candidato=0;
		String matriz[]= new String [50];
		System.out.println("Los codigos deben ser asi:");
		System.out.println("Los primer 4 digitos es el a�o entre 1990-1995");
		System.out.println("El quinto digito si es hombre o mujer");
		System.out.println("Despues si esta en la calse 1 o en la 2");
		System.out.println("Y los ultimos dos caracteres, las inicales de la persona");
		Thread.sleep(1000);
		while (bucle==0){
			
		while (bucle2==0) {
			
			comodin=0;
			System.out.println("Introduce el codigo de la persona "+(i+1));
			codigo=teclado.next();
			while (codigo.length()!=8) {
				System.out.println("Por favor introduzca un codigo correcto Ej.(1992h157)");
				System.out.println("el a�o deberia estar comprendido entre 1990 y 1995");
				
			}
			if (codigo.equals(cerrar)) {
				bucle++;
				break;
			}
			codigo=codigo.toUpperCase();
			a�o=Integer.parseInt(codigo.substring(0, 4));
			while (!(a�o>=1990 && a�o<=1995) ) {
				System.out.println("El a�o del codigo esta incorrecto, por favor vuelva a introducir el codigo");
				comodin++;
				break;
			}
			if (comodin>0) {
				break;
			}
			sexo=codigo.substring(4, 5);
			while (!(sexo.equals("H")||sexo.equals("h")||sexo.equals("m")||sexo.equals("M"))) {
				System.out.println("El sexo del codigo esta incorrecto, por favor vuelva a introducir el codigo");
				comodin++;
				break;
			}
			if (sexo.equals("H")||sexo.equals("h")) {
				sexotip=0;
			} else {
				sexotip=1;
			}
			if (comodin>0) {
				break;
			}
			clase=Integer.parseInt(codigo.substring(5,6));
			while (!(clase==1 || clase ==2)) {
				System.out.println("La clase que ha puesto ha sido incorrecto, por favor vuelva a introducir el codigo");
				comodin++;
				break;
			}
			if (comodin>0) {
				break;
			}
			
			if (comodin==0) {
				matriz[i]=codigo;	
				i ++;
				correcto++;
				candidato++;
			}
			
			
		}
		if(comodin>1){
		error++;
		}
		}
		System.out.println("Ha introducido "+error+" veces un codigo erroneo");
		System.out.println("Desea imprimir a los candidatos?");
		String opcion=teclado.next();
		opcion=opcion.toUpperCase();
		while (!(opcion.equals("S")||opcion.equals("SI")||opcion.equals("N")||opcion.equals("NO"))) {
			System.out.println("Porfavor introduzca si o no");
			opcion=teclado.next();
			opcion=opcion.toUpperCase();
		}
		if (opcion.equals("S")||opcion.equals("SI")) {
			for (int j = 0; j <candidato; j++) {
				System.out.println("El candidato "+(j+1)+" es "+(matriz[j].substring(4, 5))+ " y esta en la clase "+(matriz[j].substring(5,6)) );
				
			}
			
			
			
		}else{
			
		}
		
	}

}
