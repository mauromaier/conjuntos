package br.com.maier.mauro.testes;

import static br.com.maier.mauro.utils.ConjuntosUtils.configurarRetorno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.maier.mauro.conjuntos.Conjuntos;

/**
 * 
 * @author mauro maier
 *
 */
public class ConjuntosTest {

	private static final char[] CONJUNTO_A = { 'a', 'b', 'c', 'd' };
	private static final char[] CONJUNTO_B = { 'a', 'b', 'e', 'f', 'g', 'h' };
	private static final char[] INTERSECCAO_A_B = { 'a', 'b' };
	private static final char[] UNIAO_A_B = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

	@Test
	void testarInterseccao() {
		Conjuntos qc = new Conjuntos();
		Assertions.assertArrayEquals(INTERSECCAO_A_B, configurarRetorno(qc.interseccao(CONJUNTO_A, CONJUNTO_B)));
	}

	@Test
	void testarUniao() {
		Conjuntos qc = new Conjuntos();
		Assertions.assertArrayEquals(UNIAO_A_B, configurarRetorno(qc.uniao(CONJUNTO_A, CONJUNTO_B)));
	}

}
