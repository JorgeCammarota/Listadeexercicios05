package Ex6re;

public class Ex6retangulo {
    private float comprimento;
    private float largura;
    public Ex6retangulo(float comprimento, float largura){
        this.comprimento= comprimento;
        this.largura= largura;
    }
    public void setComprimento(float comprimento) {
        this.comprimento= comprimento;
    }
    public void setLargura(float largura) {
        this.largura= largura;
    }
    public float getComprimento() {
        return comprimento;
    }
    public float getLargura() {
        return largura;
    }
    public float area() {
        return getComprimento() * getLargura();
    }
    public float perimetro(){
        return(2 * getComprimento()) + (2 * getLargura()); }
}

