
package br.org.soudex.formatadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.org.soudex.Conversor;

public class Teste {

	public static void main(String[] args) throws IOException {
		//testePalavrasBrasileiras("lista_palavras.txt");
		//converterPalavra("Giulliano Morroni");
		//testePalavrasBrasileiras("marcas.txt");
	}

	public static void converterPalavra(String palavra) {
		String soundex = new Conversor(palavra).soundex();
		System.out.println(soundex);
	}

	public static void testePalavrasBrasileiras(String nomeArquivo) throws FileNotFoundException, IOException {
		Map<String, List<String>> base = new HashMap<String, List<String>>();

		File arquivo = new File("/opt/development/workspace/java/Soundex/lista/",nomeArquivo);
		FileReader fileReader = new FileReader(arquivo);
		BufferedReader reader = new BufferedReader(fileReader);
		while (reader.ready()) {
			String linha = reader.readLine();
			Conversor conversor = new Conversor(linha);
			List<String> lista = base.get(conversor.soundex());
			if (lista == null)
				lista = new ArrayList<>();
			lista.add(linha);
			base.put(conversor.soundex(), lista);
		}
		reader.close();

		List<String> keySet = new ArrayList<>(base.keySet());
		Collections.sort(keySet);
		for (String k : keySet) {
			List<String> palavras = base.get(k);
			System.out.println(k);
			for (String palavra : palavras) {
				System.out.print(palavra + " # ");
			}
			System.out.println();
		}
	}

}
