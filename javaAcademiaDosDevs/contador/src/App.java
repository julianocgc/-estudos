import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int contador = 0;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador = contador + 1;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador++;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador = contador - 1;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador--;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador+= 2;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador = contador + 1;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador+= 10;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador = contador + 1;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
        contador-= 1;
        JOptionPane.showMessageDialog(null, contador, "Contador", JOptionPane.INFORMATION_MESSAGE);
    }
}
