import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String jogo;
        // crio um objeto leitor para ler valores digitados no teclado
        Scanner leitor = new Scanner(System.in);

        leitor.useDelimiter("[\r\n]+");

        System.out.println("Qual o seu jogo do momento? ");


        jogo = leitor.next();

        System.out.println("Jogo é " + jogo);
    }
}
