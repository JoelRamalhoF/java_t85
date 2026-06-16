import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("***** EXERCICIO 05 DA LISTA *****");
        System.out.println("Digite números inteiros. Para sair, digite 0.\n");

        do {
            System.out.print("Digite um número inteiro: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma = soma +numero;   
            }

        } while (numero != 0);    

        System.out.println("\nA soma dos números positivos é: " + soma);

        leia.close();
    }
}