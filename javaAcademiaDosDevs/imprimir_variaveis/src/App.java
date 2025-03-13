public class App {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Son Goku"; // inicializando e declarando a variável
        String nomeComposto; // inicializando a variável
        nomeComposto = "Uzumaki Naruto"; // declarando a variável
        String filme = "Vingadores";
        int anoLancamento = 2015;
        int duracao = 240;
        double notaCritica = 8.7;
        char letraInicial = 'V';
        boolean foiSucesso = true;
        System.out.println(nomeCompleto); // imprimindo a variável
        System.out.println(nomeComposto); // imprimindo a variável
        System.out.println(filme); // imprimindo a variável
        System.out.println(anoLancamento); // imprimindo a variável
        System.out.println(duracao); // imprimindo a variável
        System.out.println(notaCritica); // imprimindo a variável
        System.out.println(letraInicial); // imprimindo a variável
        System.out.println(foiSucesso); // imprimindo a variável

        System.out.println("O filme " + filme);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Nota média: " + notaCritica);
        System.out.println("Letra Inicial: " + letraInicial);
        System.out.println("Foi um sucesso? " + foiSucesso);

        System.out.println("O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos.");
        
        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);
        
        String frase = "O filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos.";
        String frase2 = String.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);
        System.out.println(frase);
        System.out.println(frase2);

        String canal = "Academia dos Devs.";
        String mensagem = "Se inscreva no canal.";
        String mensagem2 = "Obrigado!";
        int metaInscritos = 1000;

        String mensagemFinal = mensagem + canal + mensagem2;
        String mensagemFinal2 = String.format("%s %s Meta de inscritos é %d. %s", mensagem, canal, metaInscritos, mensagem2);
        System.out.println(mensagemFinal);
        System.out.println(mensagemFinal2);
    } 
}
