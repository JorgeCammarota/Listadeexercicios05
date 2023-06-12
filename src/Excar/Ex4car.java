package Excar;

public class Ex4car {
    private float consumo;
    private float nivelCombustivel;
    public Ex4car (float consumo) {
        this.consumo= consumo;
    }
    public void andar(float distancia) {
        float temp;
        temp= distancia/this.consumo;
        this.nivelCombustivel-= temp;
    }
    public float obterGasolina(){
        return this.nivelCombustivel;
    }
    public void adicionarGasolina(float qtd) {
        this.nivelCombustivel+= qtd;
    }

    public String toString() {
        return"Carro [consumo="+ consumo+ ", nivelCombustivel="+ nivelCombustivel+ "]";}
}

