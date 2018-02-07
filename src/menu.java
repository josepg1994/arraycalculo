package arraycalculos;

import java.util.Scanner;

public class menu {
	//Genera aleatorio entre 1 y 10
		public static int generaNumero(){
		       int num=(int)(Math.random()*10)+1;
		       return num;
		}
		//Calcula el mayor del array
		public static int Mayor(int[] numeros){
			int mayor=numeros[0];
			for(int i=1; i < numeros.length; i++){
				if(numeros[i]>mayor) {
					mayor=numeros[i];			
				}
			}
			return mayor;
		}		
		// calcula el menor del array
		public static int Menor(int[] numeros){
			int menor=numeros[0];
			for(int i=1; i < numeros.length; i++){
				if(numeros[i]<menor) {
					menor=numeros[i];			
				}
			}
			return menor;   
		}
		//Calcula la media del array
		public static int calcularLaMedia(int[] numeros){
			int total=0;
			for(int i=0; i < numeros.length; i++){
				total+=numeros[i];
			}
			int media=total/20;
			return media;
			
		}
		//Muestra todos los elementos del array
		public static void mostrar(int[] numeros){
	        for(int i=0;i<numeros.length;i++) {
	        	System.out.print(numeros[i]+" ");
	        }    
		}
	
	public static void main(String[] args) {
		//Se crea el lector
				Scanner sc = new Scanner(System.in);
				int opcion;
				int[] numeros= new int[20];
				
				//generar 20 numeros
				for(int i=0;i<20;i++) {
					numeros[i]=generaNumero();	
				}
				do {
				System.out.println("menu");
				System.out.println("0.salir");
				System.out.println("1.mostrar numero mayor del array");
				System.out.println("2.mostrar numero menor del array");
				System.out.println("3.calcular media del array");
				System.out.println("4.mostrar numeros del array");
				
				
				opcion = sc.nextInt();
				switch(opcion) {
				case 1: 
					System.out.println("El mayor es el: "+Mayor(numeros));  
					break;
				case 2: 
					System.out.println("El menor es el: "+Menor(numeros));
					break;		
				case 3: 
					System.out.println("La media es: "+calcularLaMedia(numeros));
					break;
				case 4: 
					mostrar(numeros);
					break;
				case 0: 
					System.out.println("gracias por usar la aplicacion");
				default:
					System.out.println("introduzca una opcion correcta");
					break;	
				}
	}while(opcion!=0);
				sc.close();
	}
}
