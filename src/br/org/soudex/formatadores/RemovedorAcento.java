package br.org.soudex.formatadores;

public class RemovedorAcento {

	public RemovedorAcento() {
		super();
	}
	
	public String formatar(String valor) {
		//remover acentuações
		valor = valor.replace("Ã", "A");
		valor = valor.replace("Á", "A");
		valor = valor.replace("À", "A");
		valor = valor.replace("Â", "A");
		valor = valor.replace("Ẽ", "E");
		valor = valor.replace("É", "E");
		valor = valor.replace("È", "E");
		valor = valor.replace("Ê", "E");
		valor = valor.replace("Ĩ", "I");
		valor = valor.replace("Í", "I");
		valor = valor.replace("Ì", "I");
		valor = valor.replace("Î", "I");
		valor = valor.replace("Õ", "O");
		valor = valor.replace("Ó", "O");
		valor = valor.replace("Ò", "O");
		valor = valor.replace("Ô", "O");
		valor = valor.replace("Ũ", "U");
		valor = valor.replace("Ú", "U");
		valor = valor.replace("Ù", "U");
		valor = valor.replace("Û", "U");

		return valor;
	}
}
