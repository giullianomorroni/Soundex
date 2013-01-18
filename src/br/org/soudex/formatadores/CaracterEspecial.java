package br.org.soudex.formatadores;

public class CaracterEspecial {

	public CaracterEspecial() {
		super();
	}
	
	public String remover(String valor) {
		//CARACTERES ESPECIAIS
		valor = valor.replace("-", "");
		valor = valor.replace("@", "");
		valor = valor.replace("!", "");
		valor = valor.replace("$", "");
		valor = valor.replace("%", "");
		valor = valor.replace("&", "");
		valor = valor.replace("*", "");
		valor = valor.replace("+", "");
		valor = valor.replace("-", "");
		valor = valor.replace(".", "");
		valor = valor.replace(",", "");
		valor = valor.replace("|", "");
		valor = valor.replace("/", "");
		valor = valor.replace(">", "");
		valor = valor.replace("<", "");
		valor = valor.replace(":", "");
		valor = valor.replace(";", "");
		valor = valor.replace("?", "");
		valor = valor.replace("\\", "");
		valor = valor.replace("{", "");
		valor = valor.replace("}", "");
		valor = valor.replace("[", "");
		valor = valor.replace("]", "");
		valor = valor.replace("(", "");
		valor = valor.replace(")", "");
		valor = valor.replace("=", "");
		valor = valor.replace("'", "");
		valor = valor.replace("\"", "");
		return valor;
	}
}
