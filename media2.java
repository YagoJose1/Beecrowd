import java.text.DecimalFormat;
import java.util.Scanner;

public class media2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.0");

    double num1 = teclado.nextDouble();
    double num2 = teclado.nextDouble();
    double num3 = teclado.nextDouble();

    double media = ((num1*2)+(num2*3)+(num3*5))/10;

    System.out.println("MEDIA = " + deci.format(media));
  }
}
