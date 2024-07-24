import java.text.DecimalFormat;
import java.util.Scanner;

public class area {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.000");

    double A = teclado.nextDouble();
    double B = teclado.nextDouble();
    double C = teclado.nextDouble();

    double pi = 3.14159;

    double triangulo = (A * C)/2;
    double circulo = Math.pow(C, 2) * pi;
    double trapezio = ((A + B)*C)/2;
    double quadrado = Math.pow(B, 2);
    double retangulo = A * B;

    System.out.println("TRIANGULO: " + deci.format(triangulo) + "\nCIRCULO: " + deci.format(circulo) + "\nTRAPEZIO: " + deci.format(trapezio) + "\nQUADRADO: " + deci.format(quadrado) + "\nRETANGULO: " + deci.format(retangulo));
  }
}
