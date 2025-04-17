public class Main {
    public static void main(String[] args) {
        String x = "     Olá mundo, este é o novo mundo!     ";
        System.out.println(x.length()); // contar número de caracteres
        System.out.println(x + " concatenada"); // concatenação
        System.out.println(x.contains("novo")); // verificar se contem palavra
        System.out.println(x.indexOf("mundo")); // verificar última ocorrência da palavra
        System.out.println(x.toUpperCase()); // colocar todas as letras em MAIÚSCULAS
        System.out.println(x.toLowerCase()); // colocar todas as letras em minúsculas
        System.out.println(x.trim()); // remover espaços desnecessários
        System.out.println(x.substring(9)); // imprimir a partir do caractere especificado
        System.out.println(x.equals("ola")); // fazer comparação
    }
}