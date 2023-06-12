package Excar;

public class Main {
    public static void main(String[] args) {
        Ex4car meuv6= new Ex4car(8);
        meuv6.adicionarGasolina(50);
        System.out.println(meuv6.toString());
        meuv6.andar(300);
        System.out.println(meuv6.toString());
    }
}
