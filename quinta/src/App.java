
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Viagem viagem = new Viagem();
        Scanner scanner = new Scanner(System.in);

        int quantidadepessoas = 0;
        double valortot = 0;

        try {

            for(boolean fim = false; fim == false;){

            
            System.out.println("Qual seu destino ? \n Alemanha = 1   Portugal = 2   Itália = 3   Todos acima = 4    Outro = 5 ");
            int destino = scanner.nextInt();


            System.out.println("Qual o valor da viagem ?");
            Double valor = scanner.nextDouble();

            

            scanner.nextLine();

        if (destino == 4) {
                quantidadepessoas++;
                valortot += valor;
                viagem.Viagem(quantidadepessoas,valor,destino);
            }
        else if(destino == 5){
                System.out.println("Digite seu destino:");
                String outro = scanner.nextLine();
      
            }
            else{
                System.out.println("cadastrado!");
            }

            System.out.println("Deseja cadastrar mais alguém s/n?");
            String confirmacao = scanner.nextLine();
            
        if (confirmacao.equals("n") ){   
        
            fim = true;
            
            }
        else{
                fim = false;
            }
        }
        
        double resultado = valortot * viagem.getQuantidadepessoas(); 

        System.out.println("O valor da viagem somando todos os amigos que visitarão os 3 países é : R$" + resultado);
        

        scanner.close();
            
        } catch (Exception e) {
            System.out.println("Existe algum erro!");
        }
        
    }     
}

