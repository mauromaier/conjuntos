package execucao;

import conjuntos.Conjuntos;

public class ExecucaoConjuntos {

	public static void main(String[] args) {
		System.out.println("início");
		Conjuntos questaoConjuntos = new Conjuntos();
		System.out.println(questaoConjuntos.interseccaoAB());
		System.out.println(questaoConjuntos.interseccaoBC());
		System.out.println(questaoConjuntos.uniaoAB());
		System.out.println("fim");
	}

}
