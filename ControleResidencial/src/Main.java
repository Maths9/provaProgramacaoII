import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoa = new ArrayList();
        pessoa.add(new Morador(2324,"maths",14,45534,32,3));
        pessoa.add(new Funcionario(23454,"jose",43,2325567,"Porteiro",1800));


        Morador Morador1 = new Morador(148813, "Matheus", 20, 40028922, 66, 3);
        Funcionario Funcionario1 = new Funcionario(02633, "jose", 33, 99603, "Zelador", 1450);

        System.out.println(Morador1);
        System.out.println(Funcionario1);
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Bem vindo ao Condomínio!! ");
        System.out.println();
        boolean condicao = true;

        while (condicao) {

            System.out.println("Informe seu código de Controle: ");
            int Codigo = scan.nextInt();
            scan.nextLine();


            if(Codigo == 4002){
                System.out.println("Olá " + Funcionario1.getNome() +", seja Bem Vindo!");
                condicao = false;
                Funcionario1.exibirInfo();
            }else if(Codigo != 4002){
                System.out.println("Olá " + Morador1.getNome() +", seja Bem Vindo!");
                Morador1.exibirInfo();
                condicao = false;
            }



        }

    }
}