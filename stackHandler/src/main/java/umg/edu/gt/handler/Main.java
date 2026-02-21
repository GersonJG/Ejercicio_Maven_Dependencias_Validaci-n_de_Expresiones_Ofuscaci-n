package umg.edu.gt.handler;

import umg.edu.gt.stack.SymbolValidator;
import umg.edu.gt.stack.Stack;

public class Main {

	public static void main(String[] args) {
		SymbolValidator validator = new SymbolValidator();
		
		if (args.length > 0 ) {
			String line0 = args[0];
			boolean result0 = validator.validation(line0);
			System.out.println("La expresion: " + line0 + " tiene un resultado de: "+ result0); 
		}else {
		
		
		//Prueba de cadena valida
		String line1 = "(a+b) * [c-d]";
		boolean result = validator.validation(line1);
		System.out.println("La Expresion "+ line1 + " Tiene un resultado: "+ result);
		
		//Prueba de cadena invalida
		String line2 = "([)]";
		boolean result2 = validator.validation(line2);
		System.out.println("La Expresion" + line2+ " Tiene un resultado: "+ result2);
		
		//Demostracion de los metodos utilizados para la pila
		System.out.println("Metodos de la Pila:");
		Stack stack = new Stack();
		stack.push('(');
		stack.push('[');
		stack.push('{');
		System.out.println("Elementos en la pila: " + stack.getcount());
		System.out.println("Nodo Incial en la pila" + stack.getNodeInit().getdata());
		}
	}

}
