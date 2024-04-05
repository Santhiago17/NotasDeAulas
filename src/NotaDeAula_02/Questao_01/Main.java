package NotaDeAula_02.Questao_01;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Macas m = new Macas();
        System.out.println("Digite a quantidade de maçãs: ");
        m.setQuantidade(scanner.nextInt());
        m.setPreco();
        System.out.println(m.getQuantidade() + " maçãs saem a R$" + m.getPreco() + ". Total: R$" + m.total());
    }
}
