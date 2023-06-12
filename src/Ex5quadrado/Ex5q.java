package Ex5quadrado;

public class Ex5q {
    private float lado;
    public Ex5q(float lado) {
        setLado(lado);
    }
    public void setLado(float lado) {
        this.lado= lado;
    }
    public float getLado() {
        return lado;
    }
    public float area() {
        return this.lado* this.lado;
    }
}
