/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosV3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[]=new int [20];
		for (int i = 0; i < matriz.length; i++) {
			matriz[i]=(int) (Math.random()*20)+1;
			System.out.printf("%2d ", matriz[i]);
		}
		int mayor=0, ubi=0;
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i]>mayor) {
				mayor=matriz[i];
				ubi=i+1;
			}		
		}
		System.out.println();
		System.out.println("El mayor es el "+mayor+" y esta en la posición "+ubi);
	}

}
