package br.org.soudex;

import br.org.soudex.formatadores.CaracterEspecial;
import br.org.soudex.formatadores.CorretorOrtografico;
import br.org.soudex.formatadores.FormatadorLetraDupla;
import br.org.soudex.formatadores.GerardorCodigo;
import br.org.soudex.formatadores.RemovedorAcento;

public class Conversor {

	private String valor;
	private String soundex;

	public Conversor(String valor) {
		this.valor = valor.toUpperCase();
		this.valor = new RemovedorAcento().formatar(this.valor);
		this.valor = new CorretorOrtografico().formatar(this.valor);
		this.valor = new CaracterEspecial().remover(this.valor);
		this.valor = new FormatadorLetraDupla().formatar(this.valor);

		final GerardorCodigo gerardorCodigo = new GerardorCodigo();
		this.valor = gerardorCodigo.gerar(this.valor);
		this.soundex = gerardorCodigo.soundex();
	}

	public String soundex(){
		return this.soundex;
	}

	public String valor(){
		return this.valor;
	}
}
