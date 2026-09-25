package MultiHilo.Ejercicio_2;

public class MisHilos implements Runnable{
	
	@Override
	public void run() {
		
		String persona = Thread.currentThread().getName();
		for(int i=1; i<4; i++) {
			System.out.println(persona + " esta realizando la tarea : " +i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

	public static void main(String[] args) {
		MisHilos hilo = new MisHilos();
		Thread p1 = new Thread(hilo);
		Thread p2 = new Thread(hilo);
		
		p1.setName("persona_1");
		p2.setName("persona_2");
		
		p1.start();
		p2.start();
	}



}
