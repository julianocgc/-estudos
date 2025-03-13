public class App {
    public static void main(String[] args) throws Exception {
    /*
     * && AND (E)
     * || OR (OU)
     * ! NOT (NEGAÇÃO - NÃO)
     */

    // credenciais secretas para entrar no sistema
    String usuaro = "academia-dos-devs";
    String senha = "40028922";

    // usuário digitou na tela de login
    String usuarioDigitado = "joao";
    String senhaDigitada = "1234";

    boolean loginCorreto = usuarioDigitado == usuaro && senhaDigitada == senha;

    System.out.println(loginCorreto);
    }
}
