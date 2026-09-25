package MultiHilo.Ejercicio_2;

public class HiloRunnable implements Runnable{

	/**  1. Crear una clase de nombre HiloRunnable. El programa 
	  principal lanzará dos hilos (empleando la interface Runnable)
	  y después ejecutará un  bucle. Emplea isAlive para chequear 
	  cuándo acaban los hilos**/
	
	public static void main(String[] args) {
		HiloRunnable hilorun = new HiloRunnable();
		Thread hilo1 = new Thread(hilorun);
		Thread hilo2 = new Thread(hilorun);
		
		hilo1.start();
		hilo2.start();
		
		while (hilo1.isAlive() || hilo2.isAlive()) {
			System.out.println("los hilos siguen trabajando ");
			
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
		System.out.println("los hilos han terminado");

	}

	@Override
	public void run() {
	
		for(int i=0; i<10;i++) {
			System.out.println("contando : " +i);
		}
		System.out.println();
		
	}

}
