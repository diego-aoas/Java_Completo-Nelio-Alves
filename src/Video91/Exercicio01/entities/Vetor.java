package Video91.Exercicio01.entities;

public class Vetor {
    private int valor;
    private int nElementos;

    public Vetor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void negativos(int nElementos) {
        int[] vet = new int[nElementos];

        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getValor() < 0) {
                vet[i].getValor();
            }
        }
        return 0;
    }

}

