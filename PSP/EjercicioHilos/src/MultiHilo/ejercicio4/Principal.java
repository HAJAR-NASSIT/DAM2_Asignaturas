package ejercicio4;

public class Principal {
/**EJERCICIO 4

Crea un programa que contenga dos clases, Principal y DetonadorConRetardo. La clase  Principal
 contiene el main, que instanciará cuatro hilos de tipo DetonadorConRetardo y  los ejecutará.
  Cada hilo hará lo siguiente:

- Se le inicializa con un nombre y un valor numérico (contador).

- Cuando el hilo se ejecute, escribe su nombre y el contador. A continuación, reduce 
 el valor del contador en 1. Repite estas acciones hasta que el valor de contador
  sea 0 - El completar su tarea, informa de que ha finalizado.

El hilo principal del programa (main) NO debe de finalizar antes que los demás hilos.**/
	
	
	
	public static void main(String[] args) {
		DetonadorConRetardo d1 = new DetonadorConRetardo("Hajar",6);
		DetonadorConRetardo d2 = new DetonadorConRetardo("Hicham", 7);
		DetonadorConRetardo d3 = new DetonadorConRetardo("Hanae",4);
		DetonadorConRetardo d4 = new DetonadorConRetardo("Mohamed" ,3);
		
		Thread hilo1 = new Thread(d1);
		Thread hilo2 = new Thread(d2);
		Thread hilo3 = new Thread(d3);
		Thread hilo4 = new Thread(d4);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		
		try {
			hilo1.join();
			hilo2.join();
			hilo3.join();
			hilo4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("he finilazado la tarea");

	}

}
