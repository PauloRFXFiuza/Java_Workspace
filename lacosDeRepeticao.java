
import java.util.Scanner;

public class lacosDeRepeticao {
    public static void main(String[] args) {
        
        // o laço for pode ser utilizado da seguinte maneira:
        // 1º parâmetro- inicialização da variável com um valor qualquer
        // 2º parâmetro- até qual valor a variável será lida
        // 3º parâmetro- de quanto em quanto valor ela será incrementada ou decrementada

        for (int i = 0; i <= 10000; i=i+2) {
            System.out.println("i nesta iteracao tem o valor de: "+i);
        }
    
        //Scanner é uma estrutura para que o usuário insira uma informação no terminal...
        //... e deve ser seguida a estrutura a seguir  
        Scanner sc = new Scanner(System.in);
        int valorMisterioso=0;//inicialização da variável para ser utilizada no laço while

        while (valorMisterioso != 33){
            System.out.println("Insira o valor Misterioso (dica - Numero Inteiro entre 0 e 200) : ");
            valorMisterioso = sc.nextInt();
            if (valorMisterioso == 33){
                System.out.println("CERTA RESPOSTA!!!");
            }else{
                System.out.println("ERRADO!!! TENTE NOVAMENTE!!!");
            }
        }

        int cont = 0;

        do { 
            System.out.println("O contador nesta iteracao tem o valor de: "+cont);
            cont++;
        } while (cont<1000);





    }
}
