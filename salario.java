import java.text.DecimalFormat;
import java.util.Scanner;

public class salario {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");

    int num = teclado.nextInt();
    int horas = teclado.nextInt();
    double salario = teclado.nextDouble();
    double salary = horas * salario;

    System.out.println("NUMBER = " + num + "\nSALARY = U$ " + deci.format(salary));

  }
}
