package ejercicio6;

public class Buffer {
/**El objeto compartido entre el productor y el consumidor está descrito por la clase  denominada Buffer.

La clase Buffer tiene dos atributos: el primero contenido guarda un carácter (es el buffer),
  el segundo, bufferLleno indica si el buffer está lleno o está vacío, según que ésta variable  valga true o false.**/
	  private char contenido;
	  private boolean bufferLleno = false;
	  
	  public void poner(char contenido) {
		  this.contenido=contenido;
		  bufferLleno=true;
	  }
	  public char recoger() {
		  if(bufferLleno == true) {
			  bufferLleno=false;
		  }else {
			  contenido=' ';
		  }
		  return contenido;  
	  }
}
