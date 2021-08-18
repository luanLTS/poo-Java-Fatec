import javax.swing.JOptionPane;

public class IfSimples {
    public static void main (String [] args) {
        // para valores reais o compilador utiliza double por padrão

        //Variaveis primitivas  -   cada primitivo tem uma classe empacotadora associada a eles (wrapper)
        // byte: Byte
        // short: Short
        // int: Integer
        // long: Long
        // char: Character
        // float: Float
        // double: Double



        // tipo estaticamente, fala qual o tipo da variavel
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor")) ;
        if(nota >= 70.0) JOptionPane.showMessageDialog(null, "Aprovado");
        
    }
}