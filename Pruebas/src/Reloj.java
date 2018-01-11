import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Reloj {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int mihora,mimin,miseg;
		System.out.println("Introduce la Hora");
		mihora=teclado.nextInt();
		System.out.println("Introdue los Minutos");
		mimin=teclado.nextInt();
		System.out.println("Introduce los segundos");
		miseg=teclado.nextInt();
		
		Hora tiempo=new Hora(mihora, mimin, miseg);
		
		System.out.println(tiempo);
		System.out.println(tiempo.getHora()+":"+tiempo.getMin()+":"+tiempo.getSeg());
		Thread.sleep(1000);
		conversor(tiempo.getHora(),tiempo.getMin(),tiempo.getSeg());
		
		System.out.println("Ahora se ejecuta el reloj");
		operacion(tiempo.getHora(),tiempo.getMin(),tiempo.getSeg());
		
	}
	public static void operacion(int hora, int min, int seg) throws InterruptedException{
		while (hora<25){
			if (seg==60) {
				min++;
				seg=0;
			}
			if (min==60) {
				hora++;
				min=0;
			}
			if (hora==24) {
				hora=0;
			}
			seg++;
			Thread.sleep(1000);
			System.out.println(hora+":"+min+":"+seg);
		}	
	}
	public static String conversor(int hora, int min, int seg){
		Scanner teclado= new Scanner (System.in);
		String convertido="";
		int total=0;
		total=hora*60+(min);
		total=total*60+(seg);
		System.out.println("El total de segundos es "+total);
		return convertido;
	}
}
