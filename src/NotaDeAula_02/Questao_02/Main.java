package NotaDeAula_02.Questao_02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        Scanner sc = new Scanner(System.in);
        System.out.println("Determine a quantidade ATUAL em estoque: ");
        e.setAtual(sc.nextInt());
        System.out.println("Determine a quantidade MÁXIMA em estoque: ");
        e.setMax(sc.nextInt());
        System.out.println("Determine a quantidade MÍNIMA em estoque: ");
        e.setMin(sc.nextInt());
        e.media();
    }

}