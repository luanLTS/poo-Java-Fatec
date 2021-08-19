import java.util.Scanner;

import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte idade = Byte.parseByte(JOptionPane.showInputDialog("Qual a sua idade?"));

        boolean podeDirigir = idade >= 18;
        String result = podeDirigir ? "Sim, pode dirigir" : "Não, ainda não";

        //System.out.printf("Você %spode dirigir\n", podeDirigir ? "" : "não " ); // permite uma cadeia de formatação
        JOptionPane.showMessageDialog(null, String.format("Você %spode dirigir\n", podeDirigir ? "" : "não "));//? string.format permite a cadeia de caractere igual o printf
        // o String.format entrega uma string com formatação para cadeia de parametros
    }    
}
