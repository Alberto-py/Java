import java.util.*;
public class NotacionEjem {
	
	private static String depurar(String  c) {
		c=c.replaceAll("\\s", "");
		c="(" + c + ")";
		String simbolo = "+-*/()";
		String str="";
		
		for(int i=0; i< c.length(); i++) {
			if(simbolo.contains("" + c.charAt(i))) {
				str += " " + c.charAt(i) + " ";
			}
			else {
				str += c.charAt(i);
			}
		}
		return str.replaceAll("\\s", " ").trim();
	}
	
	private static int pref(String oper) {
		int prf=99;
		if(oper.equals("^")) prf=5;
		if(oper.equals("*") || oper.equals("/")) prf=4;
		if(oper.equals("+") || oper.equals("-")) prf=3;
		if(oper.equals(")")) prf=2;
		if(oper.equals("(")) prf=1;
		
		return prf;
	}
	
	public static void main(String[]args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa Una Expresion Algebaica: ");
		String exp = depurar(leer.nextLine());
		String [] inf = exp.split(" ");
		
		Stack<String> E= new Stack<String>();
		Stack<String> P= new Stack<String>();
		Stack<String> S= new Stack<String>();
		
		for(int i=inf.length-1; i>=0; i--) {
			E.push(inf[i]);
		}
		
		try {
			
			while(!E.isEmpty()) {
				
				switch(pref(E.peek())) {
				case 1:
					P.push(E.pop());
					break;
					
				case 2:
					while(!P.peek().equals("(")) {
						S.push(P.pop());
					}
					P.pop();
					E.pop();
					break;
					
				case 3:
				case 4:
					while(pref(P.peek())>= pref(E.peek())) {
						S.push(P.pop());
					}
					P.push(E.pop());
					break;
					
				default:
					S.push(E.pop());
					break;
				}
			}
			
			String infij = exp.replace(" ", "");
			String posfij = S.toString().replaceAll("[\\]\\[,]", "");
			
			System.out.println("Empresion Infija: " + infij);
			System.out.println("Empresion Postfija: " + posfij);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
