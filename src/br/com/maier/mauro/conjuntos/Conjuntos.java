package br.com.maier.mauro.conjuntos;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * @author mauro maier
 *
 */
public class Conjuntos {

	private static final char[] A = { 'p', 'a', 'n', 'd', 'o', 'r', 'a' };
	private static final char[] B = { 'p', 'i', 'r', 'a', 't', 'a' };
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
		Set<Character> charSet1 = vetorParaLinkedHashSet(primeiroVetor);
		Set<Character> charSet2 = vetorParaLinkedHashSet(segundoVetor);
		charSet1.retainAll(charSet2);
		return charSet1.toString().toCharArray();
	}

	public char[] uniao(char[] primeiroVetor, char[] segundoVetor) {
		Set<Character> charSet1 = vetorParaLinkedHashSet(primeiroVetor);
		Set<Character> charSet2 = vetorParaLinkedHashSet(segundoVetor);
		charSet1.addAll(charSet2);
		return charSet1.toString().toCharArray();
	}

	private Set<Character> vetorParaLinkedHashSet(char[] vetor) {
		String str = new String(vetor);
		List<Character> lista = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		Set<Character> charSet = new LinkedHashSet<>(lista);
		return charSet;
	}
}
