import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");

        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");

        int num2 = scanner.nextInt();
        
        System.out.println(" Caso queira somar digite 1, \n Caso queira subtrair digite 2, \n Caso queira dividir digite 3, \n Caso queira multiplicar digite 4");

        int opcao = scanner.nextInt();

        switch (opcao) {
                case 1:
                System.out.println("O valor é : " + soma(num1, num2));

                break;

                case 2:
                System.out.println("O valor é : " + subtracao(num1, num2));

                break;

                case 3:
                System.out.println("O valor é : " + divisao(num1, num2));

                break;

                case 4:
                System.out.println("O valor é : " + multiplicacao(num1, num2));

                break;
            
        
            default:
                break;
        }

        
      

        scanner.close();

    }

    public static int soma(int num1,int num2) {

        return num1 + num2;

    }

    public static int subtracao(int num1,int num2) {

        return num1 - num2;

    }

    public static int divisao(int num1,int num2) {

        return num1 / num2;

    }

    public static int multiplicacao(int num1,int num2) {

        return num1 * num2;

    }

}

