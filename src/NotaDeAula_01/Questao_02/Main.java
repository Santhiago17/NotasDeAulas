package NotaDeAula_01.Questao_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da variável 1:");
        double var1 = scanner.nextDouble();

        System.out.println("Digite o valor da variável 2:");
        double var2 = scanner.nextDouble();

        scanner.close();


        if (var1 > var2) {
            System.out.println("A variável 1 é maior que a variável 2.");
        } else if (var1 == var2) {
            System.out.println("As variáveis são iguais.");
        } else {
            System.out.println("A variável 2 é maior que a primeira.");
        }
    }

}
