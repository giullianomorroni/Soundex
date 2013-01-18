package br.org.soudex.formatadores;

public class GerardorCodigo {

	private String soundex;
	
	public GerardorCodigo() {
		super();
	}

	/**
	 * Padrão do soundex para palavras americanas
	 * 
	 * 1. B, P, F, V
	 * 2. C, S, K, G, J, Q, X, Z
	 * 3. D, T
	 * 4. L
	 * 5. M, N
	 * 6. R
	 * @param valor
	 * @return
	 */
	public String gerar(String valor) {
		String primeiraLetra = valor.substring(0,1);
		this.soundex = valor.substring(1,valor.length());

		String[] primeiraPalavra = this.soundex.split(" ");
		if (primeiraPalavra.length != 0)
			this.soundex = primeiraPalavra[0];

		this.soundex = this.soundex.replace("B", "1");
		this.soundex = this.soundex.replace("C", "2");
		this.soundex = this.soundex.replace("D", "3");
		this.soundex = this.soundex.replace("F", "1");
		this.soundex = this.soundex.replace("G", "2");
		this.soundex = this.soundex.replace("J", "2");
		//this.soundex = this.soundex.replace("K", "2");
		this.soundex = this.soundex.replace("L", "4");
		this.soundex = this.soundex.replace("M", "5");
		this.soundex = this.soundex.replace("N", "5");
		this.soundex = this.soundex.replace("P", "1");
		this.soundex = this.soundex.replace("Q", "2");
		this.soundex = this.soundex.replace("R", "6");
		this.soundex = this.soundex.replace("S", "2");
		this.soundex = this.soundex.replace("T", "3");
		this.soundex = this.soundex.replace("V", "1");
		this.soundex = this.soundex.replace("X", "2");
		this.soundex = this.soundex.replace("Z", "2");

		valor = valor.replace("A", "");
		valor = valor.replace("E", "");
		valor = valor.replace("I", "");
		valor = valor.replace("O", "");
		valor = valor.replace("U", "");
		valor = valor.replace("Y", "");
		valor = valor.replace("W", "");
		valor = valor.replace("H", "");

		this.soundex = this.soundex.replace("A", "");
		this.soundex = this.soundex.replace("E", "");
		this.soundex = this.soundex.replace("I", "");
		this.soundex = this.soundex.replace("O", "");
		this.soundex = this.soundex.replace("U", "");
		this.soundex = this.soundex.replace("Y", "");
		this.soundex = this.soundex.replace("W", "");
		this.soundex = this.soundex.replace("H", "");

		this.soundex = primeiraLetra + this.soundex.substring(0, this.soundex.length());  

		while (this.soundex.length() <= 4)
			this.soundex += "0";

		if (this.soundex.length() >= 5)
			this.soundex = this.soundex.substring(0, 4);

		return valor;
	}

	public String soundex(){
		return this.soundex;
	}

}
