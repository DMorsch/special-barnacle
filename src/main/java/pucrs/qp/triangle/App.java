package pucrs.qp.triangle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
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
	public static double distancia(double x1, double y1, double x2, double y2) throws ParseException {
		double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		String resultado = String.format("%.4f", result);
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY);
		result = nf.parse(resultado).doubleValue();
		return result;
	}

	/**
	 * 
	 * @param args
	 * @throws ParseException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws ParseException, FileNotFoundException {
		System.out.println("Triângulos!");
		System.out.println(identificaTriangulo(2, 3, 4));
		//System.out.println("Distância!");
		//System.out.println(distancia(1.0, 7.0, 5.0, 9.0));
		Scanner in = new Scanner(new FileReader("entrada"));
		String[] dados = new String[2];
		int i = 0;
		while(in.hasNext()) {
			dados[i] = in.nextLine();
			i++;
		}
		double x1 = Double.parseDouble(dados[0].split(" ")[0]);
		double x2 = Double.parseDouble(dados[1].split(" ")[0]);
		double y1 = Double.parseDouble(dados[0].split(" ")[1]);
		double y2 = Double.parseDouble(dados[1].split(" ")[1]);
		System.out.println(distancia(x1, y1, x2, y2));
	}
}








