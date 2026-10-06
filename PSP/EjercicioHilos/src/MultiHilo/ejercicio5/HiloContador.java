package ejercicio5;

public class HiloContador implements Runnable {
	private int contador = 0;
	private boolean ejecutando = true;

	/**
	 * Todos los hilos parten con una prioridad normal.
	 * 
	 * El botón “Finalizar todos” finaliza la ejecución de todos los hilos.
	 * 
	 * En las etiquetas de abajo a la izquierda se muestran los contadores de cada
	 * hilo. Al iniciarse el programa cada hilo empieza a contar desde cero y cada
	 * segundo incrementa su contador, mostrándolo en la etiqueta.
	 * 
	 * En las etiquetas de abajo a la derecha se muestra la prioridad que tiene cada
	 * hilo. Cada vez que se cambie la prioridad se debe actualizar la etiqueta.
	 * 
	 **/
	

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public void run() {
		while (ejecutando) {
			try {
				Thread.sleep(1000);
				contador++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void finalizar() {
		ejecutando = false;
	}

}
