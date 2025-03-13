import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroA = -5;
        int numeroB = 7;

        int resultado = Math.abs(numeroA);
        int maior = Math.max(numeroA, numeroB);
        int menor = Math.min(numeroA, numeroB);

        JOptionPane.showMessageDialog(null, resultado, "Classe Math", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, maior, "Contador", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, menor, "Contador", JOptionPane.INFORMATION_MESSAGE);
    }
}
