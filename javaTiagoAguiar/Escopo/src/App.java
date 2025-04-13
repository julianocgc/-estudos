public class App {
    public static void main(String[] args) {
        // ESCOPO DE VARIÁVEIS
        int x;
        if(true) {
            x = 10; // variável local
        } else {
            x = 2;
        }
        System.out.println(x);
    }
    
}
    
