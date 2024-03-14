package testeGupy;

public class teste02 {

	@SuppressWarnings("unused")
	public static boolean Fibonacci(int n) {
		   int a = 0;
	       int b = 1;
	       
	        if (n == a || n == b) {
	            return true;
	        }
	        
	        while (true) {
	            int c = a + b;
	            if (c == n) {
	                return true;
	            } else if (c > n) {
	                return false;
	            }
	            a = b;
	            b = c;
	        }
	}
	
	public static void main(String[] args) {
		int numeroSelecionado = 2;
		if(Fibonacci(numeroSelecionado))
			System.out.println("o número está.");
		else {
			System.out.println("O número não está.");
		}
		
	}
}
