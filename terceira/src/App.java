
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Operacao operacao = new Operacao();


        System.out.println("Digite a primeira nota");

        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota");

        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota");

        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota");

        double nota4 = scanner.nextDouble();

        System.out.println("A média das notas é: "+ operacao.media(nota1, nota2, nota3, nota4));



        scanner.close();

    }
}
