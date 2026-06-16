import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade;
        int menorV = 0;
        int maiorC = 0;
        char continua = 'S';

        System.out.println("********************************");
        System.out.println("*** PESQUISA DE FAIXA ETARIA ***");
        System.out.println("********************************\n");

        while (continua == 'S') {

            System.out.println("Digite uma idade: ");
            idade = leia.nextInt();

            if (idade < 0) {
                break;
            }

            if (idade < 21) {
                menorV++;
            }

            if (idade > 50) {
                maiorC++;
            }

            System.out.println("DESEJA CONTINUAR? (S/N)");
            continua = leia.next().toUpperCase().charAt(0);
        }

        System.out.printf("\nTOTAL DE PESSOAS MENORES DE 21 ANOS: %d\n", menorV);
        System.out.printf("TOTAL DE PESSOAS MAIORES DE 50 ANOS: %d\n", maiorC);

        leia.close();
    }
}