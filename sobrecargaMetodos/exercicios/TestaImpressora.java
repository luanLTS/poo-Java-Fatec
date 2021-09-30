package exercicios;

public class TestaImpressora {
    public static void main(String[] args) {
        Impressora imp = new Impressora();

        imp.exibir(10.0f);
        imp.exibir(20.0f, 12.50f);
        imp.exibir(120.10f, "Ola mundo");
        imp.exibir("Hello World", 123.45f);
        imp.exibir("Ola mundo", "tudo bem?", "Sim");
        imp.exibir(1, 2, "3");
    }
}