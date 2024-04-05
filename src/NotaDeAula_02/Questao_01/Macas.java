package NotaDeAula_02.Questao_01;

public class Macas {
    private double preco;
    private int quantidade;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco() {
        if (quantidade >= 12) {
            preco = 1.00;
        } else {
            preco = 1.30;
        }
    }

    public double getPreco() {
        return preco;
    }

    public double total() {
        return preco * quantidade;
    }
}