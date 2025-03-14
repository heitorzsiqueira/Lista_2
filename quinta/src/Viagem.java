import javax.print.DocFlavor.STRING;

public class Viagem {

    private int quantidadepessoas;
    private double valor;
    private int destino;
    
    public void Viagem(int quantidadedepessoas, double valor,int destino){
        try{

            setQuantidadepessoas(quantidadedepessoas);
            setValor(valor);
            setDestino(destino);

        }
        catch(Exception e){

            System.out.println("Não é possível guardar um valor vazio!");

        }
    }

    public int getQuantidadepessoas(){
        return this.quantidadepessoas;
    }

    public String getValor(){
        String valor = String.valueOf(this.valor);
        return valor;
    }

    public int getDestino(){
        return this.destino;
    }

    public void setQuantidadepessoas(int quantidadedepessoas){
        this.quantidadepessoas = quantidadedepessoas;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void setDestino(int destino){
        this.destino = destino;
    }
    
}
