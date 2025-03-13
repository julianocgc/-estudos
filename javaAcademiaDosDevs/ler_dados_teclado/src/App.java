import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        // Scanner -> classe
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = leitor.nextInt();

        System.out.println("Número é " + numero);
    }
}
