public class App {
    public static void main(String[] args) throws Exception {
        String[] nomes = new String[5];

        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "Vitor";
        nomes[3] = "Camila";
        nomes[4] = "Cirilo";

        for(int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++){
            System.out.println(nomes[posicaoVetor]);
        }
}
