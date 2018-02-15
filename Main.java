public class Main{
	
	public static void main(String[] arg){
		System.out.println("");
		System.out.println("Numeros Primos");
		System.out.println("");
		System.out.println("\n\n\t\tEjercicio No.3");
		System.out.println("");
		System.out.println("");

		//variables y numeros a comparar
		int numeros[] = {1,97,53,72};
		
		//contadores
		int contador1 = 0;

		//iniciadores
		int i = 0, v = 0;

		//recorrido del arreglo de numeros
		for(v = 0;v<4;v++){
			//desiciones para la comparacion de los numeros y sus mensajes.

			for(i = 1; i<=numeros[v]; i++){

				if((numeros[v]%i)==0){

					contador1++;
				}

			}
			//validacion de numero menor a 2.
			if(numeros[v]<2){
				System.out.println("El numero "+(numeros[v])+" no es primo.");
				System.out.println("");

			}else{
				//validacion de numero primo
				if(contador1<=2){

					System.out.println("El numero "+(numeros[v])+" es primo.");
					System.out.println("");
				}else{
					System.out.println("El numero "+(numeros[v])+" no es primo.");
					System.out.println("");
				}
			}
			//reinicio del contador
			contador1=0;
		}
	}

}