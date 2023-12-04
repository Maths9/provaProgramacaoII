public class Pessoa {
    private int CPF;
    private String Nome;
    private int Idade;
    private int Telefone;

    public Pessoa(int CPF, String nome, int idade, int telefone) {
        this.CPF = CPF;
        this.Nome = nome;
        this.Idade = idade;
        this.Telefone = telefone;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public void exibirInfo(){
        System.out.println();
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Telefone: "+this.Telefone);
    }
}
