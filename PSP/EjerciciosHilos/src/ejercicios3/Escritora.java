package ejercicios3;

public class Escritora implements Runnable {
	private boolean b ;
	public Escritora(boolean b) {
		this.b=b;
	}

	@Override
	public void run() {
		 while(true) {
			if (b == true) {
				for (int i = 1; i < 31; i++) {
					System.out.println(i);
				}
			}else {
				for(char letra = 'a' ; letra <= 'z';letra++) {
					System.out.println(letra);
				}
			}
		 }
		}

	}
	/**
	 * EJERCICIO 3
	 * 
	 * Crea un programa que contenga dos clases, Principal y Escritora. La clase
	 * Principal con tiene el main, que instanciará dos hilos de tipo Escritora y
	 * los ejecutará. Cada hilo hará lo siguiente (indefinidamente):
	 * 
	 * - Si se inicializa con un True, escribirá números del 1 al 30.
	 * 
	 * - Si se inicializa con un False, escribirá letras de la ‘a’ a la ‘z’
	 * 
	 * Comprueba que las salidas de ambos hilos salen mezcladas por la consola.
	 **/


