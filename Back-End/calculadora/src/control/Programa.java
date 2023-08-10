package control;

public class Programa {
	
	public static void main(String[] args) {
		
		// Exemplo de instanciação de objeto
		// Classe, objto, operador de instanciação e metódo construtor
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(34, 21));
		
		System.out.println(calc.subtrair(3, 2));

		System.out.println(calc.dividir(123, 21));

		System.out.println(calc.multiplicar(3, 21));

	}
	
}
