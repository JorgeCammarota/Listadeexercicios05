package Ex1bola;
    public class Main {
        public static void main(String[] args) {
            ClasseBola bola = new ClasseBola();
            bola.cor = "verde";
            System.out.println(bola.cor);
            System.out.println(bola.trocacor("vermelho"));
            System.out.println(bola.mostracor());
        }
    }

