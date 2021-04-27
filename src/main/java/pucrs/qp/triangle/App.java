package pucrs.qp.triangle;


/**
 * 
 * @author marco.mangan@pucrs.br
 * 
 */
public class App {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int identificaTriangulo(int a, int b, int c) {
		if ((a < b + c) && (b < a + c) && (c < b + a)) {
			if ((a == b) && (b == c))
				return tipos.EQUILATERO.value();
			else if ((a != b) && (a != c) && (b != c))
				return tipos.ESCALENO.value();
			else
				return tipos.ISOSCELES.value();
		}
		return tipos.INVALIDO.value();
	}
	
	//metodo para calcular a distancia entre 2 pontos
	public static double distancia(double x1, double y1, double x2, double y2) {
		double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		String resultado = String.format("%.4f", result);
		result = Double.parseDouble(resultado); 
		return result;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Triângulos!");
		System.out.println(identificaTriangulo(2, 3, 4));
	}
}








