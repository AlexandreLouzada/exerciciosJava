package dominio;

public class Produto {
	
	private int codigo;
	private int quantidade;
	private double valorUnitario;
	private int formaPagamento;
	
	public Produto(int codigo, int quantidade, double valorUnitario, int formaPagamento) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.formaPagamento = formaPagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public double calcularDesconto() {
		double desconto = 0;
		if (formaPagamento == 1)
			desconto = (valorUnitario * quantidade) * 10/100;
		else
			desconto = (valorUnitario * quantidade) * 5/100;
		return desconto;
	}
	
	public double valorFinal() {
		return quantidade * valorUnitario - calcularDesconto();
	}
}
