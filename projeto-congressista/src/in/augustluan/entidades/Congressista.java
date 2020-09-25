package in.augustluan.entidades;

import java.util.HashMap;

public class Congressista {
    /*
    um cliente solicita que em seu congresso, alem do cadastro comum, seja criado em paralelo
    um cadastro de pessoas com nomes cuja quantidade de letras, multiplicada por 8, seja a chave
    paraseu posicionamento em uma tabela hashing.
     */
    private String nome;
    private int cpf;

    public Congressista(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    // verifica se o obj e um Congressista e se possui o mesmo nome que o
    // obj que foi inserido como exemplar de busca
    public boolean equals(Object o) {
        if ((o instanceof Congressista) &&
                ((Congressista) o).getNome().equals(this.getNome())) {
            // se encontrar o slot, usa o metohd equals() p/ cada obj no slot em busca
            // do obj que procurarmos
            return true;
        }
        return false;
    }

    public int hashCode() {
        // algoritmo para calcular o hashing
        return getNome().length() * 8;
    }

    @Override
    public String toString() {
        return   nome;
    }
}
