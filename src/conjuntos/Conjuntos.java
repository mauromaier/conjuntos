package conjuntos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conjuntos {

	private static final char[] A = { 'p', 'a', 'n', 'd','o','r','a'};
	private static final char[] B = { 'p', 'i', 'r', 'a', 't','a' };
	private static final char[] C = { 'm', 'a', 'c', 'u', 'n', 'a', 'i', 'm', 'a' };

	/**
	 * Retorna a intersecção entre A e B
	 */
	public char[] interseccaoAB() {
		return interseccao(A, B);
	}

	/**
	 * Retorna a intersecção entre B e C
	 */
	public char[] interseccaoBC() {
		return interseccao(B, C);
	}

	/**
	 * Retorna a uniao entre A e B
	 */
	public char[] uniaoAB() {
		return uniao(A, B);
	}

	public char[] interseccao(char[] primeiroVetor, char[] segundoVetor) {
		List<Object> listaInterseccao = new ArrayList<>();

		for (int i = 0; i < primeiroVetor.length; i++) {
			for (int j = 0; j < segundoVetor.length; j++) {
				if (primeiroVetor[i] == segundoVetor[j]) {
					listaInterseccao.add(primeiroVetor[i]);
					break;
				}
			}
		}

		return configurarRetorno(listaInterseccao);
	}

	private char[] configurarRetorno(List<Object> listaInterseccao) {
		return listaInterseccao.toString().replace("[", "").replace(",", "").replace(" ", "").replace("]", "")
				.toCharArray();
	}

	public char[] uniao(char[] primeiroVetor, char[] segundoVetor) {
		char[] vetorUniao = new char[primeiroVetor.length + segundoVetor.length];
		int contador = 0;
		for (int i = 0; i < primeiroVetor.length; i++) {
			vetorUniao[contador++] = primeiroVetor[i];
		}

		for (int i = 0; i < segundoVetor.length; i++) {
			if (!existeElemento(segundoVetor[i], vetorUniao, contador)) {
				vetorUniao[contador++] = segundoVetor[i];
			}
		}

		return Arrays.copyOf(vetorUniao, contador);
	}

	private static boolean existeElemento(int x, char[] vet, int c) {
		for (int i = 0; i < c; i++) {
			if (vet[i] == x) {
				return true;
			}
		}
		return false;
	}

}
