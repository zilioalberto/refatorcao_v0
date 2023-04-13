public class Exemplo {
    public static void main(String[] args) {
        Letra letra = new LetraA();
        char[][] arr = letra.desenhar();

        Escritor escritor = new Escritor();
        escritor.escrever(arr);
    }
}
