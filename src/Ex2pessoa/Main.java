package Ex2pessoa;

public class Main {
    public static void main(String[] args) {

       Ex2pessoa p = new Ex2pessoa("Zalava", 28, 45.00, 1.96);
        Ex2pessoa p2 = new Ex2pessoa("Tiara", 40, 1.75, 0);
        System.out.println(p.nome);
        p.crescer(0.30);
        System.out.println(p.idade);
        p.envelhecer(2);
        System.out.println(p.peso);
        p.engordar(0.10);
        System.out.println(p.altura);

    }
}
