package MultiHilo.Ejercicio_3;

public class Principal{

	public static void main(String[] args) {
		Escritora e = new Escritora(false);
		
		Thread e1 = new Thread(e);
		e1.start();
		
		Thread e2 = new Thread(e);
		e2.start();
	}



	
}
