import java.text.DecimalFormat;
import java.util.Scanner;
public class esfera {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.000");

    double raio = teclado.nextDouble();
    double pi = 3.14159;
    double volume = (4/3.0)*pi*Math.pow(raio, 3);

    System.out.println("VOLUME = " + deci.format(volume));
  }
}
