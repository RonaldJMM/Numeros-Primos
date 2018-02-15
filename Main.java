public class Main{
	
	public static void main(String[] arg){
		System.out.println("");
		System.out.println("Comparacion de Numeros");
		System.out.println("");
		System.out.println("\n\n\t\tEjercicio No.1");
		System.out.println("");
		System.out.println("");

		//variables y numeros a comparar
		int numeros[] = {1,97,53,72};
		

		int contador1 = 0;
		int i = 0;

		//desiciones para la comparacion de los numeros y sus mensajes.

		for(i = 1; i<=numeros[1]; i++){

			if((numeros[1]%i)==0){

				contador1++;
			}

		}
		if(numeros[1]<2){
			System.out.println("El numero "+(numeros[1])+" no es primo.");
			System.out.println("");

		}else{

			if(contador1<=2){

				System.out.println("El numero "+(numeros[1])+" es primo.");
				System.out.println("");
			}else{
				System.out.println("El numero "+(numeros[1])+" no es primo.");

			}
		}
	}

}