/**
 * 
 */

/**
 * @author usuario
 *
 */
public class EjerciciosV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector1[]=new int[10];
		int vector2[]=new int[10];
		int vectorsuma[]=new int [10];
		int mayorn1=0, mayorn2=0, mayorr3=0;
		
		for (int i = 0; i < vectorsuma.length; i++) {
			vector1[i]=(int)(Math.random()*10)+1;
			vector2[i]=(int)(Math.random()*10)+1;
			vectorsuma[i]=vector1[i]+vector2[i];
			System.out.println("La suma entre "+vector1[i]+" y "+vector2[i] +" es "+vectorsuma[i]);
		}
		for (int i = 0; i < vectorsuma.length-1; i++) {
			for (int j = 0; j < vectorsuma.length-1; j++) {
				if (vectorsuma[j]>vectorsuma[j+1]) {
					mayorn1=vector1[j+1];
					mayorn2=vector2[j+1];
					mayorr3=vectorsuma[j+1];
					vector1[j+1]=vector1[j];
					vector2[j+1]=vector2[j];
					vectorsuma[j+1]=vectorsuma[j];
					vector1[j]=mayorn1;
					vector2[j]=mayorn2;
					vectorsuma[j]=mayorr3;
				}
			}
			
		}
		System.out.println();
		for (int i = 0; i < vector1.length; i++) {
			if (vector1[i]==10) {
				System.out.print(vector1[i]+" ");
			}else {
				System.out.print(" "+vector1[i]+" ");
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print("+  ");
		}
		System.out.println();
		for (int i = 0; i < vector2.length; i++) {
			if (vector2[i]==10) {
				System.out.print(vector2[i]+" ");
			}else {
				System.out.print(" "+vector2[i]+" ");
			}
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			if (vectorsuma[i]>=10) {
				System.out.print("== ");
			}else {
				System.out.print(" = ");
			}
		}
		System.out.println();
		for (int i = 0; i < vectorsuma.length; i++) {
			if (vectorsuma[i]>=10) {
				System.out.print(vectorsuma[i]+" ");
			}else {
				System.out.print(" "+vectorsuma[i]+" ");
			}
		}
	
	}

}
