/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosV7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][]=new int [5][5];
		int comodin[]=new int [5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j]=(int)(Math.random()*20)-10;
				System.out.printf("%3d ",matriz[i][j]);
			}
		System.out.println();
		}
		System.out.println("Por favor introduzca que fila desea cambiar");
		
		System.out.println("Por cual desea cambiarla?");
		
	
	}

}
