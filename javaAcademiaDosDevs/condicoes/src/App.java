public class App {
    public static void main(String[] args) throws Exception {
        boolean estaChovendo = false;
        boolean temGuardaChuva = false;

        if (estaChovendo == false && temGuardaChuva == true){
            // executa os comandos que estiverem aqui caso seja verdadeiro
            System.out.println("Está chovendo lá fora!");
        } else if (estaChovendo == true) {
            System.out.println("Você pode dançar na chuva!");
        } else {
            System.out.println("Não está chovendo...");
        }
    }
}
