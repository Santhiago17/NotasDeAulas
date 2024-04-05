package NotaDeAula_04.Questao_03;

public class Carro {
    private String marca, modelo;
    public Carro (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public void mostrarDetalhes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}