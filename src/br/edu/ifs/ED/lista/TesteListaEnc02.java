package br.edu.ifs.ED.lista;

public class TesteVetor {

    public static void main(String[] args) {

        ListaSimplesEncadeada<Integer> lista = new ListaSimplesEncadeada<>();

        lista.incluir(2);
        lista.incluir(3);

        lista.TransformarEmVetor();
    }
}
