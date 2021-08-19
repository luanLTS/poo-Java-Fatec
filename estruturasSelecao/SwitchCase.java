import javax.swing.*;

public class SwitchCase {
    public static void main(String[] args) {
        String conceito = JOptionPane.showInputDialog("Qual foi o seu conceito?");
        switch(conceito) {
            case "A":
                JOptionPane.showMessageDialog(null, "Parabéns");
            case "B":
                JOptionPane.showMessageDialog(null, "Excelente");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Bom");
                break;
            case "R":
                JOptionPane.showMessageDialog(null, "Vamos tentar novamente");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Conceito inválido");
        }
    }
}
