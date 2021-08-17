package entities;

public class PessoaJuridica extends Pessoa {

	private int num_funcionario;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double rendaAnual, int num_funcionario) {
		super(nome, rendaAnual);
		this.num_funcionario = num_funcionario;
	}

	public int getNum_funcionario() {
		return num_funcionario;
	}

	public void setNum_funcionario(int num_funcionario) {
		this.num_funcionario = num_funcionario;
	}

	@Override
	public double imposto() {
		double valor;
		if (num_funcionario < 10) {
			return valor = getRendaAnual() * 0.16;
		} else {
			return valor = getRendaAnual() * 0.14;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNome() + ":");
		sb.append("$" + String.format("%.2f", imposto()));
		return sb.toString();
	}

}
