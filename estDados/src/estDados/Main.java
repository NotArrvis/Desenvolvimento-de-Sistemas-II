package estDados;

import java.io.*;


public class Main {

	public static void main(String[] args) throws Exception {
		Vetor lista = new Vetor(10);
		
		
		FileReader arq = new FileReader("produtos.txt");
		BufferedReader br = new BufferedReader(arq);
		String linha = null;
		linha = br.readLine();
		
		int cont =0;
		
		while(linha != null) {
			String[]  dados = linha.split(";");
			Produto p = new Produto();
			p.codigo = Integer.parseInt(dados[0]);
			p.descricao = dados[1];
			p.precoUnit = Double.parseDouble(dados[2]);
			p.qtdEstoque = Integer.parseInt(dados[3]);
			lista.add(cont, p);
			linha = br.readLine();
			cont++;
		}
		lista.show();
		
		
		
		
		
		
	}

}
