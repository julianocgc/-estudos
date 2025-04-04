import java.util.Random;

public class App {
    public static void main(String[] args) {
        //var login = "Ola";
        //var login = "Mundo";
        var password = "12345";        
        var number1 = 10;
        var number2 = false;

        // variáveis -> tipo: Textos (Strings)
        // variáveis -> tipo: Números (Int)
        // variáveis -> tipo: Números fracionados (Double)
        // variáveis -> tipo: Lógicos (Boolean) | Verdadeiro ou Falso

        // TIPOS DE DADOS
        String login = "Ola"; // reperesentação de texto (ASCII)
        int number3 = 50; // representação de números inteiros
        double percent = 24.30; // representação de números fracionados
        boolean isDriver = true; // representação de valores lógicos (verdadeiro ou falso)

        int number4; // variável que não foi inicializada
        number4 = 55;
        System.out.println(number4 + 10);

        System.out.println(login);
        System.out.println(password);
        System.out.println(number1);
        System.out.println(number3);
        System.out.println(percent);
        System.out.println(isDriver);
    }
}
