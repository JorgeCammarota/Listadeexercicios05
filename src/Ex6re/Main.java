package Ex6re;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float comp, larg;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Informe o valor do comprimento: ");
        comp= teclado.nextFloat();
        System.out.println("Informe o valor da largura: ");
        larg= teclado.nextFloat();

        Ex6retangulo r= new Ex6retangulo(comp,larg);
        System.out.println("A área é: "+ r.area());
        System.out.println("O perimetro é: "+ r.perimetro());
    }
}
