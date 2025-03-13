public class App {
    public static void main(String[] args) throws Exception {
        
        // variáveis do tipo inteiro
        byte numeroPequeno = 127;
        short numeroShort = 32767;
        int numeroMaior = 2147483647;
        long numeroEnorme = 922337203685477000l;
        // byte (valores entre -128 e 127)
        // short (valores entre -32768 e 32767)
        // int (valores entre -2147483648 e 2147483647)
        // long (valores entre 922337203685477000)

        // variáveis do tipo ponto flutuante
        float peso = 78.7f;
        double pi = 3.141287931298312987398127983;
        char letra = 'c';
        boolean estouComFome = true;
        String texto = "Se está curtindo, deixe o like!";
        // float (valores com casas decimais - letra f no final)
        // double (valores com casas decimais - não precisa da letra f)
        // char (variáveis do tipo caractere - armazena apenas uma letra entre ' ')
        // string (variáveis do tipo texto - armazena textos entre " ")
        // boolean (armazena valores verdadeiro ou falso)
        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroMaior);
        System.out.println(peso);
        System.out.println(pi);
        System.out.println(letra);
        System.out.println(estouComFome);
        System.out.println(texto);
    }
}