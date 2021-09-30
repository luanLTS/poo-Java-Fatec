package exercicios;

public class Impressora {
    public void exibir (float x) {
        System.out.println(x);
    }

    public void exibir (float x, float x2) {
        System.out.println(x + ", " + x2);
    }

    public void exibir (float x, String x2) {
        System.out.println(x + ", " + x2);
    }

    public void exibir (String x, float x2) {
        System.out.println(x + ", " + x2);
    }

    public void exibir (String x, String x2, String x3) {
        System.out.println(x + ", " + x2 + ", " + x3);
    }

    public void exibir (int x, int x2, String x3) {
        System.out.println(x + ", " + x2 + ", " + x3);
    }
}