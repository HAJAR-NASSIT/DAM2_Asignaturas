package ejercicio6;

public class Productor extends Thread{
	private Buffer b ;
	
	public Productor(Buffer b) {
		this.b = b;
	}


	public void run() {
		
		try {
			for(int i =0;i<10;i++) {
				 char letra = (char) ('a' + Math.random() * 26);
				 b.poner(letra);
				 System.out.println(letra);
				 Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
