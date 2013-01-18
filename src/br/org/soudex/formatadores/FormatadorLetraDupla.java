package br.org.soudex.formatadores;

public class FormatadorLetraDupla {

	public FormatadorLetraDupla() {
		super();
	}
	
	public String formatar(String valor) {
		//TRANSFORMAR LETRAS DUPLAS EM UNIDADES
		valor = valor.replace("AA", "A");
		valor = valor.replace("EE", "E");
		valor = valor.replace("II", "I");
		valor = valor.replace("OO", "O");
		valor = valor.replace("UU", "U");
		valor = valor.replace("PP", "P");
		valor = valor.replace("RR", "R");
		valor = valor.replace("TT", "T");
		valor = valor.replace("LL", "L");
		valor = valor.replace("VV", "V");
		valor = valor.replace("BB", "B");
		valor = valor.replace("MM", "M");
		valor = valor.replace("NN", "N");
		valor = valor.replace("ZZ", "Z");
		valor = valor.replace("XX", "X");
		valor = valor.replace("CC", "C");
		valor = valor.replace("KK", "K");
		valor = valor.replace("JJ", "J");
		valor = valor.replace("GG", "G");
		valor = valor.replace("FF", "F");
		valor = valor.replace("DD", "D");
		valor = valor.replace("YY", "Y");
		valor = valor.replace("WW", "W");
		return valor;
	}
}
