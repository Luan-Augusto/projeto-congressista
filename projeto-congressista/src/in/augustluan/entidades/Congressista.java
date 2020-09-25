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

    public int hashCode() {
        // algoritmo de criacao de hashing aqui
        return getNome().length() * 8;
    }
}
