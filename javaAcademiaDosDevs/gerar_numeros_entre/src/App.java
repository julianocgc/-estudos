import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        double dado6faces = Math.random() * 2;
        JOptionPane.showMessageDialog(null, dado6faces);

        Random gerador = new Random();
        int numero = gerador.nextInt(6) + 1; // 6 é o maior número e 1 é o menor número
        JOptionPane.showMessageDialog(null, numero);
    }
}
