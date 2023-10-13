package br.edu.ifs.ED.lista;

public class ListaSimplesEncadeada<T extends Comparable<T>> extends Lista<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private T[] elementos;
    private int tamanho;

    public ListaSimplesEncadeada() {
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public void incluir(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (tamanho == 0) {
            inicio = novoNo;
        } else {
            ultimo.prox = novoNo;
        }
        ultimo = novoNo;
        tamanho++;
    }

    public T get(int posicao) throws Exception {
        if (posicao < 0 || posicao >= tamanho) {
            throw new Exception("Posição solicitada não existe na lista");
        }

        No<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.prox != null) {
                atual = atual.prox;
            }
        }
        return atual.dado;
    }

    public int getPosElemento(T elemento) {
        No<T> atual = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (atual.dado.equals(elemento)) {
                return i;
            }
            atual = atual.prox;
        }
        return -1;
    }

    @Override
    public void remover(int posicao) throws Exception {
        if (posicao < 0 || posicao > tamanho) {
            throw new Exception("Posição solicitada não existe na lista");
        }

        if (posicao == 0) {
            inicio = inicio.prox;
        } else if (posicao == tamanho-1) {
            ultimo.prox = null;
        } else {
            No<T> aux = inicio;
            for (int i = 0; i < posicao-1; i++) {
                aux = aux.prox;
            }

            No<T> remove = aux.prox;
            aux.prox = remove.prox;
            if (posicao == tamanho-1){
                ultimo = aux;
            }
        }
        tamanho--;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    public void limpar() {
        inicio = null;
        ultimo = null;
        tamanho = 0;
    }

    @Override
    public boolean contem(T elemento) {
        int posicao = getPosElemento(elemento);
        return posicao > -1;
    }

    @Override
    public int compareTo(Lista<T> item) {
        No<T> atual = inicio;
        No<T> novoNo = ((ListaSimplesEncadeada<T>) item).inicio;
        int listaQtd = tamanho;
        int itemQtd = item.getTamanho();

        if (listaQtd < itemQtd) {
            return -1;
        } else if (listaQtd > itemQtd) {
            return 1;
        } else {
            while (atual != null && novoNo != null) {
                int compare = atual.dado.compareTo(novoNo.dado);

                if (compare != 0) {
                    System.out.print("Quantidade de elementos: ");
                    return listaQtd + itemQtd;
                }

                atual = atual.prox;
                novoNo = novoNo.prox;
            }
            return 0;
        }
    }

    //metodo teste
//    @Override
//    public T[] TransformarEmVetor() {
//        elementos = (T[]) new Comparable[tamanho];
//        imprimirVetorRecursivo(elementos, 0);
//        return elementos;
//    }
//
//    private void imprimirVetorRecursivo(T[] elementos, int posicao) {
//        if (posicao == tamanho) {
//            return;
//        }
//
//        No<T> atual = inicio;
//        elementos[posicao] = atual.dado;
//        inicio = atual.prox;
//        System.out.print(elementos[posicao] + " ");
//        imprimirVetorRecursivo(elementos, posicao+1);
//    }

    //metodo melhorado
    @Override
    public T[] TransformarEmVetor() {
        elementos = (T[]) new Comparable[tamanho];
        imprimirVetorRecursivo(inicio, elementos, 0);
        return elementos;
    }

    private void imprimirVetorRecursivo(No<T> atual, T[] elementos, int posicao) {
        if (posicao == tamanho) {
            return;
        }

        elementos[posicao] = atual.dado;
        System.out.print(elementos[posicao] + " ");
        imprimirVetorRecursivo(atual.prox, elementos, posicao+1);
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        No<T> atual = inicio;
        builder.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.dado).append(", ");
            atual = atual.prox;
        }

        builder.append(atual.dado).append("]");
        return builder.toString();
    }

}