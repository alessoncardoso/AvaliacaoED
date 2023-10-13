package br.edu.ifs.ED.lista;

public class TesteListaEnc {

    public static void main(String[] args) throws Exception {

        ListaSimplesEncadeada<Integer> lista = new ListaSimplesEncadeada<>();

        System.out.println("Adicionando elementos na lista:");
        lista.incluir(6);
        lista.incluir(5);
        lista.incluir(4);
        lista.incluir(3);
        lista.incluir(2);
        lista.incluir(1);

        System.out.println(lista.toString());
        System.out.println("Tamanho: " + lista.getTamanho());

        System.out.println();

        System.out.println("Pegando o elemento da posição:");
        System.out.println("Elemento: " + lista.get(3));

        System.out.println();

        System.out.println("Pegando a posição do elemento:");
        System.out.println("Posição: " + lista.getPosElemento(4));

        System.out.println();

        System.out.println("Removendo o elemento da posição:");
        lista.remover(5);

        System.out.println(lista.toString());
        System.out.println("Tamanho: " + lista.getTamanho());

        System.out.println();

        System.out.println("Verificando se contem o elemento:");
        System.out.println(lista.contem(2));

        System.out.println();

        System.out.println("Limpando a lista:");
        lista.limpar();

        System.out.println(lista.toString());
        System.out.println("Tamanho: " + lista.getTamanho());

    }

}
