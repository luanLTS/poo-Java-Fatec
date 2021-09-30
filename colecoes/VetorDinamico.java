public class VetorDinamico {
    private int [] elementos;
    private int qtd;
    private int cap;

    VetorDinamico() {
        this.qtd = 0;
        this.cap = 4;
        this.elementos = new int[this.cap];
    }

    public boolean estaCheio () {
        return this.qtd == this.cap;
    }

    public void add (int elem) {
        if (!estaCheio()) {
            elementos[this.qtd] = elem;
            this.qtd++;
        }
    }

    public void show () {
        System.out.printf("Qtd -> %d, Capacidade -> %d\n", this.qtd, this.cap);
        //enhanced for ou for each desdeo java 5;
        /* for (int elemento : this.elementos) {
            System.out.printf("%d ", elemento);
        } */
        for(int i = 0; i < this.cap; i++) {
            System.out.printf("%d ", this.elementos[i]);
        }
        System.out.println();
    }
}
