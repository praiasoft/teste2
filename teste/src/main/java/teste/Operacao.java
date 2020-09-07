package teste;

public class Operacao {

	public Operacao() {
	}
	
	public static double soma( double x, double y) {
		return x+y;
	}
	
	public static double multiplicacao ( double x, double y ) {
		return x*y;
	}

	public static double divisao (double x, double y) {
		return x/y;
	}
	
	public static double subtracao (double x, double y) {
		return x-y;
	}
	public static double media (double x, double y) {
		return divisao( soma(x,y), 2f);
	}
}
