package umg.edu.gt.stack;

public class SymbolValidator {
	public boolean validation(String expression) {
		Stack stack = new Stack();
		
		for (int i =0; i<expression.length(); i++) {
			char symbol = expression.charAt(i);
			
			if (symbol == '(' || symbol == '{' || symbol == '[') {
				stack.push(symbol);	
			}
			
			else if (symbol == ')' || symbol == '}' || symbol == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				
				if (!isPair(top, symbol)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	private boolean isPair(char open, char close) {
		if (open == '(' && close == ')') return true;
		if (open == '[' && close == ']') return true;
		if (open == '{' && close == '}') return true;
		return false;	
		
	}
}
