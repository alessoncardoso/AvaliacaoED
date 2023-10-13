package br.edu.ifs.ED.lista;

public class TesteListaEnc03 {

    public static void main(String[] args) throws Exception {

        ListaSimplesEncadeada<String> lista = new ListaSimplesEncadeada<>();

        lista.incluir("BA");
        lista.incluir("SE");
        lista.incluir("SP");
        lista.incluir("RJ");
        lista.incluir("DF");

        System.out.println(lista.toString());

        ListaSimplesEncadeada<String> item  = new ListaSimplesEncadeada<>();

        item.incluir("BA");
        item.incluir("SE");
        item.incluir("SP");
        item.incluir("RJ");
        item.incluir("DF");

        System.out.println(item.toString());

        System.out.println();
        System.out.println("Resultado do compareTo:");
        System.out.println(lista.compareTo(item));

    }

}
