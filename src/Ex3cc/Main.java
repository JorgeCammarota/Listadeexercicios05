package Ex3cc;

public class Main {
    public static void main(String[] args) {
        Contac i= new Contac(123, "Rute Lustosa",100.0f);
        System.out.println(i.toString());
        i.setNome("Jorge Cammarota");
        i.deposito(510);
        System.out.println(i.toString());
        i.saque(250);
        System.out.println(i.toString());

    }
}
