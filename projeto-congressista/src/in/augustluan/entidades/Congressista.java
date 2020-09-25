package in.augustluan.entidades;

public class Congressista {

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
        return getNome().length() * 8;
    }
}
