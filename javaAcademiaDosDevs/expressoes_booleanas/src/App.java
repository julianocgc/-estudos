import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int idade = 20;
        /*
         * > maior que
         * < menor que
         * >= maior ou igual a
         * <= menor ou igual a
         * == igual a
         * != diferente de 
         */
        boolean resultado = idade >= 18;

        JOptionPane.showMessageDialog(null, resultado);
    }
}
