package br.org.soudex.formatadores;

public class CorretorOrtografico {

	public CorretorOrtografico() {
		super();
	}
	
	public String formatar(String valor) {
		//converter consoantes com o mesmo fonema (ss e ç)
		valor = valor.replace("SS", "S");
		valor = valor.replace("Ç", "S");
		valor = valor.replace("Z", "S");
		valor = valor.replace("X", "S");
		valor = valor.replace("K", "C");
		valor = valor.replace("Y", "I");
		valor = valor.replace("W", "V");

		//CORRIGIR ERRO COMUNS DA LINGUA
		valor = valor.replace("NP", "MP");
		valor = valor.replace("NB", "MB");
		return valor;
	}
	
}
