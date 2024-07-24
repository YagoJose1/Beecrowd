import java.text.DecimalFormat;
import java.util.Scanner;

public class media1 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00000");

    double num1 = teclado.nextDouble();
    double num2 = teclado.nextDouble();

    double media = ((num1*3.5)+(num2*7.5))/11;

    System.out.println("MEDIA = " + deci.format(media));
  }
}