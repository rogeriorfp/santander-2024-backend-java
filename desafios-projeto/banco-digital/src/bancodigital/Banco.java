package bancodigital;

import java.util.Collections;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> geContas() {
        return Collections.unmodifiableList(contas);
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
