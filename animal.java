import java.util.Scanner;

public class animal {

    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     
     String first = teclado.nextLine();
     String second = teclado.nextLine();
     String third = teclado.nextLine();

    String pcr = "vertebrado";
    String ave = "ave";
    String inseto = "inseto";
    String carnivoro = "carnivoro";
    String onivoro = "onivoro";
    String herbivoro = "herbivoro";
    String hematofago = "hematofago";


     if (first.equals(pcr) && second.equals(ave) && third.equals(carnivoro)) {
        System.out.println("aguia");
     }else if (first.equals(pcr) && second.equals(ave) && third != carnivoro){
        System.out.println("pomba");
     }else if (first.equals(pcr) && second != ave && third.equals(onivoro)){
        System.out.println("homem");
     }else if (first.equals(pcr) && second != ave && third != onivoro){
        System.out.println("vaca");
     }else if (!first.equals(pcr) && second.equals(inseto) && third.equals(hematofago)){
        System.out.println("pulga");
     }else if (!first.equals(pcr) && second.equals(inseto) && third != hematofago){
        System.out.println("lagarta");
     }else if (!first.equals(pcr) && second != inseto && third.equals(hematofago)){
        System.out.println("sanguessuga");
     }else if (!first.equals(pcr) && second != inseto && third != hematofago){
        System.out.println("minhoca");
     }
    }
}