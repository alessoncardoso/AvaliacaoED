package br.edu.ifs.ED.lista;

public class TesteListaSimplesEncadeada {

    public static void main(String[] args) throws Exception {

        ListaSimplesEncadeada<Integer> lista = new ListaSimplesEncadeada<>();

        lista.incluir(2);
        lista.incluir(1);
        lista.incluir(5);

        System.out.println(lista.toString());
        System.out.println("Tamanho: " + lista.getTamanho());

        lista.remover(2);
        System.out.println(lista.toString());
        System.out.println("Tamanho: " + lista.getTamanho());
    }

}
