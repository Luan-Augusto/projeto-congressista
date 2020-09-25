package in.augustluan.entidades;

public class Congressista {
    /*
    um cliente solicita que em seu congresso, alem do cadastro comum, seja criado em paralelo
    um cadastro de pessoas com nomes cuja quantidade de letras, multiplicada por 8, seja a chave
    paraseu posicionamento em uma tabela hashing.
     */
    private String nome;
    private String cpf;

    public Congressista(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // verifica se o obj e um Congressista e se possui o mesmo nome que o
    // obj que foi inserido como exemplar de busca
    public boolean equals(Object o) {
        if ((o instanceof Congressista) &&
                ((Congressista) o).getNome().equals(this.getNome())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        // algoritmo de criacao de hashing aqui
        return getNome().length() * 8;
    }
}
