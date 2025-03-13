import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroA = 20;
        int numeroB = 2;

        int soma = numeroA + numeroB;
        int subtracao = numeroA - numeroB;
        int multiplicacao = numeroA * numeroB;
        float divisao = numeroA / numeroB;
        int resto = numeroA % numeroB;

        JOptionPane.showMessageDialog(null, soma, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, subtracao, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, multiplicacao, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, divisao, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resto, "Matemática", JOptionPane.INFORMATION_MESSAGE);
    }
}
