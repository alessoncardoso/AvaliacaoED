package br.edu.ifs.ED.lista;

public class No<T> {

    public T dado;
    public No<T> prox;

    public No(T dado) {
        this.dado = dado;
        this.prox = null;
    }

    public No(T dado, No<T> proximo) {
        this.dado = dado;
        this.prox = proximo;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                ", prox=" + prox +
                '}';
    }

}
