public class Morador extends Pessoa{
    private int NumApartamento;
    private int NumBloco;

    public Morador(int CPF, String nome, int idade, int telefone, int numApartamento, int numBloco) {
        super(CPF, nome, idade, telefone);
        NumApartamento = numApartamento;
        NumBloco = numBloco;
    }

    public int getNumApartamento() {
        return NumApartamento;
    }

    public void setNumApartamento(int numApartamento) {
        NumApartamento = numApartamento;
    }

    public int getNumBloco() {
        return NumBloco;
    }

    public void setNumBloco(int numBloco) {
        NumBloco = numBloco;
    }

    public String toString(){
        return "Número Apartamento: "+ getNumApartamento() + " Número do bloco: " + getNumBloco() + " " ;
    }

}
