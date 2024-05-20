package listOrdenarPessoas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPessoaPorIdade = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(listaPessoaPorIdade);
            return listaPessoaPorIdade;
        }
        throw new RuntimeException("A lista está vazia!");
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaPessoaPorAltura = new ArrayList<>(pessoaList);
        if (!pessoaList.isEmpty()) {
            Collections.sort(listaPessoaPorAltura, new ComparadorPorAltura());
            return listaPessoaPorAltura;
        }
        throw new RuntimeException("A lista está vazia");
    }

}
