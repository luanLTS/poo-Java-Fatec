import javax.swing.JOptionPane;

public class IfElse {
    public static void main (String [] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota"));
        if (nota >= 70.0) JOptionPane.showMessageDialog(null, "Aprovado");
        else JOptionPane.showMessageDialog(null, "Reprovado");
    }
}
    