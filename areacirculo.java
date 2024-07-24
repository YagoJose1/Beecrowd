import java.text.DecimalFormat;
import java.util.Scanner;

public class areacirculo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.0000");

    double raio = teclado.nextDouble();
    double n = 3.14159;
    double area = n * (Math.pow(raio, 2));

    System.out.println("A=" + deci.format(area));
  }
}
