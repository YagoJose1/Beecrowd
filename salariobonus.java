import java.text.DecimalFormat;
import java.util.Scanner;

public class salariobonus {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.00");

    String nome = teclado.nextLine();
    double fixo= teclado.nextDouble();
    double vendas = teclado.nextDouble();

    double total = fixo +((15*vendas)/100);

    System.out.println("TOTAL = R$ " + deci.format(total));
  }
}
