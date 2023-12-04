public class PessoaControle extends Controle{

   Pessoa pessoa = new Pessoa(148813,"Maths",20,9090);
    public PessoaControle(int codigo, boolean ativo) {
        super(codigo, ativo);

    }

    PessoaControle pessoaFuncionario = new PessoaControle(4002,true);
    PessoaControle Morador = new PessoaControle(1234,false);
    public void exibirInfo(){
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Ativo: " + this.isAtivo());


    }



}
