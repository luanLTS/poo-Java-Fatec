public class VetorDinamico {
    private int[] elementos;
    private int qtd;
    private int cap;

    VetorDinamico() {
        this.qtd = 0;
        this.cap = 4;
        this.elementos = new int[this.cap];
    }

    public boolean estaCheio() {
        return this.qtd >= this.cap;
    }

    public boolean estaVazio() {
        return this.qtd <= 0;
    }

    public void add(int elem) {
        if (estaCheio())
            redimencionar(2);
        this.elementos[this.qtd] = elem;
        this.qtd++;
    }

    public void remover() {
        if (!estaVazio()) {
            this.qtd--;
            if (this.cap > 4 && this.qtd <= this.cap / 4) { // a capaciodade precisa ser no minimo 4 e ele estar pelo
                                                            // menos 1 / 4 cheia
                this.redimencionar(0.5);
            }
        }
    }

    private void redimencionar(double fatorMult) {
        // 1. alocar um vetor novo com o dobro da capacidade
        /* todo vetor é objeto(ficam na heap) */
        int[] aux = new int[(int) (this.cap * fatorMult)];
        // 2. Copiar todos os elementos existentes para o vetor novo
        for (int i = 0; i < this.qtd; i++) {
            aux[i] = this.elementos[i];
        }
        // 3 . passar a utilizar o vetor novo, descartar o antigo
        this.elementos = aux;
        // 4. ajeitar a variavel de capacidade
        this.cap = (int) (this.cap * fatorMult);
    }

    /*
     * private void reduzirCapacidade() { // 1. alocar um vetor novo com a metade da
     * capacidade int[] aux = new int[this.cap / 2]; // 2. Copiar todos os elementos
     * existentes para o vetor novo for (int i = 0; i < this.qtd; i++) { aux[i] =
     * this.elementos[i]; } // 3 . passar a utilizar o vetor novo, descartar o
     * antigo this.elementos = aux; // 4. ajeitar a variavel de capacidade this.cap
     * /= 2; }
     */

    public void show() {
        System.out.printf("Qtd -> %d, Capacidade -> %d\n", this.qtd, this.cap);
        for (int i = 0; i < this.qtd; i++) {
            System.out.printf("%d ", this.elementos[i]);
        }
        System.out.println();
    }
}
