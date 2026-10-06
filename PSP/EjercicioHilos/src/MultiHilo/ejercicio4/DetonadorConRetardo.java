package ejercicio4;

public class DetonadorConRetardo implements Runnable{
	private String nombre ;
	private int contador ;
	/**EJERCICIO 4

	Crea un programa que contenga dos clases, Principal y DetonadorConRetardo. La clase  Principal
	 contiene el main, que instanciará cuatro hilos de tipo DetonadorConRetardo y  los ejecutará.
	  Cada hilo hará lo siguiente:

	- Se le inicializa con un nombre y un valor numérico (contador).

	- Cuando el hilo se ejecute, escribe su nombre y el contador. A continuación, reduce 
	 el valor del contador en 1. Repite estas acciones hasta que el valor de contador
	  sea 0 - El completar su tarea, informa de que ha finalizado.

	El hilo principal del programa (main) NO debe de finalizar antes que los demás hilos.**/
	
	public DetonadorConRetardo(String nombre, int contador) {
		this.nombre= nombre;
		this.contador= contador;
	}
	
	
	@Override
	public void run() {
		
		while(contador!=0) {
			System.out.println(nombre+ " : " +contador);
			contador--;
			
		}
		System.out.println("termino su tarea");
		
		
		
	}

	

}
