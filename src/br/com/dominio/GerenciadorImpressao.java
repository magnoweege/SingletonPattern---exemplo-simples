package br.com.dominio;

public class GerenciadorImpressao {
	
	//singleton model: variavel estatica com o mesmo nome da classe.
	private static GerenciadorImpressao gerenciadorImpressao;
	
	//metodo construtir vazio e privado não permite criar novas instancias da classe.
	private GerenciadorImpressao() {
		
	}
	
	//Este metodo retorna a variavel com a unica instancia criada.
	public static GerenciadorImpressao getInstance() {
		//se for nulo é criado uma instancia e retornado essa referencia. Caso contrario retorne a instancia que já existe.
		// Assim sendo todos objetos ocuparão a mesma instancia.
		if (gerenciadorImpressao == null)
			gerenciadorImpressao = new GerenciadorImpressao();
		
		return gerenciadorImpressao;
	}

}
