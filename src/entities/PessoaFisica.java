package entities;

public class PessoaFisica extends Pessoa {

	private double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double valor;
		if (getRendaAnual() < 2000.00) {
			valor = getRendaAnual() * 0.15;
		} else {
			valor = getRendaAnual() * 0.25;
		}
		valor = valor - gastoSaude * 0.5;
		return valor;
		
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getNome() + ":");
		sb.append(" $" + String.format("%.2f", imposto()));
		return sb.toString();
	}

}
