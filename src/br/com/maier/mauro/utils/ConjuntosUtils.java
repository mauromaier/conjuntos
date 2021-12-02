package br.com.maier.mauro.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author mauro maier
 *
 */
public class ConjuntosUtils {
	
	private ConjuntosUtils() {
		throw new AssertionError("Esta classe nao deve ser instanciada");
	}

	public static char[] configurarRetorno(char[] vetor) {
		List<Object> lista = new ArrayList<Object>();
		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		return lista.toString().replace("[", "").replace(",", "").replace(" ", "").replace("]", "").toCharArray();
	}
}
