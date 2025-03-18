package estDados;

public class Produto {
	int codigo;
	String descricao;
	double precoUnit;
	int qtdEstoque;
	
	Produto(){
		
	}
	
	Produto (int codigo, String descricao, double precoUnit, int qtdEstoque){
		this.codigo= codigo;
		this.descricao = descricao;
		this.precoUnit = precoUnit;
		this.qtdEstoque = qtdEstoque;
	}
	
	public void mostraProduto() {
		System.out.println(codigo + " - " + descricao + " - " + precoUnit + " - " + qtdEstoque);
	}
	

}
