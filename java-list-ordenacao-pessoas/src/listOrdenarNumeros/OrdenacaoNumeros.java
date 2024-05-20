package listOrdenarNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaNumerosCrescente = new ArrayList<>(this.listaDeNumeros);
        if (!listaDeNumeros.isEmpty()) {
            Collections.sort(listaNumerosCrescente);
            return listaNumerosCrescente;
        }
        throw new RuntimeException("A lista está vazia");
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaNumerosCrescentes = new ArrayList<>(this.listaDeNumeros);
        if (!listaDeNumeros.isEmpty()) {
            listaNumerosCrescentes.sort(Collections.reverseOrder());
            return listaNumerosCrescentes;
        }
        throw new RuntimeException("A lista está vazia");
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaDeNumeros=" + listaDeNumeros +
                '}';
    }
}
