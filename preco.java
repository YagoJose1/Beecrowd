import java.util.Scanner;

public class preco {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    
    String line1 = teclado.nextLine();
    String[] parts1 = line1.split(" ");
    int code1 = Integer.parseInt(parts1[0]);
    int quantity1 = Integer.parseInt(parts1[1]);
    double unitPrice1 = Double.parseDouble(parts1[2]);

    
    String line2 = teclado.nextLine();
    String[] parts2 = line2.split(" ");
    int code2 = Integer.parseInt(parts2[0]);
    int quantity2 = Integer.parseInt(parts2[1]);
    double unitPrice2 = Double.parseDouble(parts2[2]);

    double total = (quantity1 * unitPrice1) + (quantity2 * unitPrice2);

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);



  }
}
