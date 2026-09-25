package MultiHilo.Ejercicio_3;

public class Escritora implements Runnable{
	private int numero = 0;
	 private boolean entrada=false;
	 
	 
	public Escritora(boolean b) {
		this.entrada=b;
	}


	@Override
	public void run() {
		while(true) {
			if(entrada == true) {
				while(numero!=30) {
					numero++;
					System.out.println(numero);
				}
			}else {
				for(int i = 97; i<=122;i++) {
					System.out.println((char) i);
				}
			}
		}
		
	}
	
}
