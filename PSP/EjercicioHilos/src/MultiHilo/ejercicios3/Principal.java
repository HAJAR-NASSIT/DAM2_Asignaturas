package ejercicios3;

public class Principal {

	public static void main(String[] args) {
		Escritora e1 = new Escritora(true);
		Escritora e2 = new Escritora(false);
		Thread hilo1 = new Thread(e1, "Hajar");
		Thread hilo2 = new Thread(e2, "Hicham");
		
		hilo1.start();
		hilo2.start();

	}
}
