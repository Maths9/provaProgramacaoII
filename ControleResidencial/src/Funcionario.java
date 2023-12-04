public class Funcionario extends Pessoa{
    private String funcao;
    private float salario;

    public Funcionario(int CPF, String nome, int idade, int telefone, String funcao, float salario) {
        super(CPF, nome, idade, telefone);
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Função: " + this.funcao);
        System.out.println("Salário: " + this.salario);

    }
    public String toString(){
        return "Nome:" + getNome() + " Função:" + getFuncao() + " Salário:" + getSalario() ;
    }

}
