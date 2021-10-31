package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import conjuntos.Conjuntos;

public class ConjuntosTest {

	private static final char[] CONJUNTO_A = { 'a', 'b', 'c', 'd' };
	private static final char[] CONJUNTO_B = { 'a', 'b', 'e', 'f', 'g', 'h' };
	private static final char[] INTERSECCAO_A_B = { 'a', 'b' };
	private static final char[] UNIAO_A_B = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };

	@Test
	void testarInterseccao() {
		Conjuntos qc = new Conjuntos();
		Assertions.assertArrayEquals(INTERSECCAO_A_B, qc.interseccao(CONJUNTO_A, CONJUNTO_B));
	}

	@Test
	void testarUniao() {
		Conjuntos qc = new Conjuntos();
		Assertions.assertArrayEquals(UNIAO_A_B, qc.uniao(CONJUNTO_A, CONJUNTO_B));
	}

}
