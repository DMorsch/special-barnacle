package pucrs.qp.triangle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;
/**
 * 
 * @author daniel.morsch@edu.pucrs.br
 * 
 */
public class App {

	
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
		System.out.println("Distância:");
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








