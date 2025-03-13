public class App {
    public static void main(String[] args) throws Exception {
        String corFruta = "verde";

        if (corFruta == "vermelho"){
            System.out.println("Está madura!");
        } else if (corFruta == "amarelo"){
            System.out.println("Está quase madura.");
        } else if (corFruta == "verde"){
            System.out.println("Não está boa para comer.");
        } else {
            System.out.println("Não coma! Está podre!");
        }
    }
}
