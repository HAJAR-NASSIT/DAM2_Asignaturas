package MultiHilo.Ejercicio_2;

public class HiloThread extends Thread{


	
	public void run() {
		for(int i =0; i<5;i++) {
			System.out.println(Thread.currentThread().getName() + " : " +i);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HiloThread hilot1 = new HiloThread();
			HiloThread hilot2 = new HiloThread();
			
			hilot1.start();
			hilot2.start();
			
			while(hilot1.isAlive() || hilot2.isAlive()) {
				System.out.println("sigue ejecutandose");
					try {
						hilot1.join();
						hilot2.join();
					} catch (Exception e) {
						// TODO: handle exception
					}
			}
			System.out.println("han terminado");
	}
}
