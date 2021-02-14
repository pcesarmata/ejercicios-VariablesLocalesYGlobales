/**
 * 
 */
package net.tecgurus;

/**
 * @author Cesar
 *
 */
public class Principal {
	// Una variable global se comparte en todos lo metodos y ademas le estamos agregando que se utilice en las variables estaticas
	static boolean valorBoolean = true;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables Locales.
		//Tipos de datos primitivos (ENTEROS)
		byte valorB = 25;
		char valorC = 1;
		short valorS = 3443;
		int valorI = 123456789;
		long valorL = 12345678L;
		
		multiplicar();
				
		// Tipo de datos primitivos (CONDICIONAL)
		boolean valorBoolean = false;
		System.out.println("Variable Boolean local: " + valorBoolean);
		
		int contador = 0;
		// SENTENCIAS ITERATIVAS
		while (contador < 10) {
			System.out.println("CONTADOR WHILE: " + ++contador); // Se incrementa primero
//			System.out.println("CONTADOR WHILE: " + contador++); // Se incrementa despues
		}
	}
	
	public static void multiplicar (){
		System.out.println("Variqable Boolean global: " + valorBoolean);
	}
	// Con This se indica que esta llamando a una variable global (en variables que no sean estaticas)
}