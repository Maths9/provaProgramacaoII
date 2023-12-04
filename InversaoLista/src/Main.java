
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int numeros;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva Seus Números:");
        numeros = scan.nextInt();
        scan.close();

        for( int i = 0; i++){
            if( i%2 == 1){
                System.out.println(i);
            }
        }

    }
}