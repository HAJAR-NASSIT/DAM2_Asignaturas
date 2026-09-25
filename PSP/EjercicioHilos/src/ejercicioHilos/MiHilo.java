package ejercicioHilos;

public class MiHilo implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=1000;i++) {
			System.out.println(Thread.currentThread().getName() + "trabajando : " +i);
		}
		
	}
	public static void main(String[] args) {
		MiHilo miHil = new MiHilo();
		
		Thread hilo1 = new Thread(miHil, "miHilo1");
		
		Thread hilo2 = new Thread(miHil, "miHilo2");
		
		hilo1.start();
		hilo2.start();
		
		try {
	        hilo1.join();
	        hilo2.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    System.out.println("¡TODOS LOS HILOS HAN TERMINADO DE CONTAR!");
		
	}



}
