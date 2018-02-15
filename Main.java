public class Main{
	
	public static void main(String[] arg){
		System.out.println("");
		System.out.println("Comparacion de Numeros");
		System.out.println("");
		System.out.println("\n\n\t\tEjercicio No.1");
		System.out.println("");
		System.out.println("");

		//variables y numeros a comparar
		int num1 = 1;
		int num2 = 19;
		int num3 = 32;
		int num4 = 53;

		int contador1 = 0;
		int i = 0;

		//desiciones para la comparacion de los numeros y sus mensajes.

		for(i = 1; i<=num1; i++){

			if((num1%i)==0){

				contador1++;
			}

		}
		if(num1<2){
			System.out.println("El numero "+(num1)+" no es primo.");
			System.out.println("");

		}else{

			if(contador1<=2){

				System.out.println("El numero "+(num1)+" es primo.");
				System.out.println("");
			}else{
				System.out.println("El numero "+(num1)+" no es primo.");

			}
		}
	}

}