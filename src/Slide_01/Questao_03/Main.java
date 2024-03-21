package Slide_01.Questao_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média do aluno é " + String.format("%.2f", media));

        scanner.close();

        if (media >= 7) {
            System.out.println("O aluno está aprovado");
        } else if (media < 7 && media > 5) {
            System.out.println("O Aluno está apto para realizar a prova final.");

        }else {
            System.out.println("O aluno está reprovado.");
        }

    }
}
