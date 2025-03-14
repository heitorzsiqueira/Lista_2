
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Calculo calculo = new Calculo();

        System.out.println("Qual o valor da gasolina?");

        double preco = scanner.nextDouble();

        System.out.println("Informe quantos litros foram vendidos: ");

        double litros = scanner.nextDouble();

        System.out.println("O valor a ser pago é: R$"+ calculo.precogasolina(preco,litros));


        scanner.close();


    }
}
