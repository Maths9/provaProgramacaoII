import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Morador Morador1 = new Morador(148813, "Matheus", 20, 40028922, 66, 3);
        Funcionario Funcionario1 = new Funcionario(02633, "jose", 33, 99603, "Zelador", 1450);

        System.out.println(Morador1);
        System.out.println(Funcionario1);
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao Condomínio ");
        System.out.println();
        boolean condicao = true;

        while (condicao) {

            System.out.println("Informe o código de Controle: ");
            int Codigo = scan.nextInt();
            scan.nextLine();


            if(Codigo == 4002){
                condicao = false;
                Funcionario1.exibirInfo();
            }else if(Codigo != 4002){
                Morador1.exibirInfo();
                condicao = false;
            }



        }

    }
}