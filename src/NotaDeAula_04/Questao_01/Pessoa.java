package NotaDeAula_04.Questao_01;

public class Pessoa {
    protected String nome;
    protected int idade;
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}