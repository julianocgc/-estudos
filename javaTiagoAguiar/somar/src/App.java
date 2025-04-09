public class App {
    public static void main(String[] args) {
        sum(10, 15);
        sum(11, 5);
        sum(12, 3);
        sum(13, 5);
    }

    static void sum(int x, int y) {
        // static void = declaração padrão
        // sum = nome da função
        // () = parâmetros da função | (tipo e nome da variável)
        // {} = corpo da função | bloco de código que será executado

        System.out.println(x + y);
    }
}
