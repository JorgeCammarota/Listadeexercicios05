package Ex2pessoa;

public class Ex2pessoa {
    String nome;
    Integer idade;
    Double peso;
    Double altura;

    public Ex2pessoa(String nome, Integer idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Ex2pessoa(String nome, Integer idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0.0;
        this.altura = altura;
    }

    public void envelhecer(int anos) {
        this.idade += anos;
        if (this.idade <21);
        crescer(0.5);
    }
    public void engordar(double peso){
        this.peso += peso;
    }

    public void emagrecer(double peso){
        this.peso -= peso;
    }

    public void crescer( double altura){
        this.altura += 0.10;
    }
}
