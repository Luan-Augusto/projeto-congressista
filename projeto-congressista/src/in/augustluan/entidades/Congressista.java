package in.augustluan.entidades;

public class Congressista extends Pessoa {

	public Congressista(String nome, String cpf) {
		super(nome, cpf);
	}

	public int hashCode() {
		return getNome().length() * 8;
	}
}
