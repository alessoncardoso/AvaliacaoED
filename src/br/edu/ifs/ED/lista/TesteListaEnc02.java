package br.edu.ifs.ED.lista;

public class TesteListaEnc02 {

    public static void main(String[] args) throws Exception {

        ListaSimplesEncadeada<Integer> lista = new ListaSimplesEncadeada<>();

        lista.incluir(1);
        lista.incluir(2);
        lista.incluir(3);
        lista.incluir(4);
        lista.incluir(5);

        //imprimindo o vetor de forma recursiva
        System.out.print("Vetor: [ ");
        lista.TransformarEmVetor();
        System.out.println("]");

        System.out.println("Tamanho: " + lista.getTamanho());

        System.out.println();

        System.out.println("Removendo o elemento da posição:");
        lista.remover(3);

        System.out.print("Vetor: [ ");
        lista.TransformarEmVetor();
        System.out.println("]");

        System.out.println("Tamanho: " + lista.getTamanho());

    }

}
