/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosV6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[][]=new int [10][10];
		int suma[]=new int [10];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[0].length; j++) {
				vector[i][j]=(int)(Math.random()*10)-5;
				suma[i]=suma[i]+vector[i][j];
				System.out.printf("%2d ",vector[i][j]);
			}
			System.out.printf("La suma de la fila %2d es =%3d ",(i+1),suma[i]);
			System.out.println();
		}
		
		for (int i = 0; i < vector[0].length; i++) {
			for (int j = 0; j < vector.length; j++) {
				suma[i]=suma[i]+vector[j][i];
			}
			System.out.printf("La suma de la columna %2d es= %3d",(i+1),suma[i]);
			System.out.println();
		}
		
	}

}
