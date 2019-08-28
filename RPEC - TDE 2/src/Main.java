public class Main {
	public static void main(String[] args) {
		Fila primeira = construir(3);

		inserir(primeira, 5);

		cheia(primeira);

		vazio(primeira);

		remove(primeira);

		vazio(primeira);

		inserir(primeira, 1);
		inserir(primeira, 2);
		inserir(primeira, 30);
		inserir(primeira, 40);

		System.out.println(primeiro(primeira));

		System.out.println(ultimo(primeira));

		imprimir(primeira);

		System.out.println();

		Fila segunda = construir(5);

		inserir(segunda, 5);
		inserir(segunda, 6);
		inserir(segunda, 7);
		inserir(segunda, 8);
		inserir(segunda, 9);
		inserir(segunda, 10);

		imprimir(segunda);

		System.out.println();

		Fila terceira = construir(3);
		inserir(terceira,1);
		inserir(terceira,30);
		inserir(terceira,50);

		imprimir(terceira);
		System.out.println();

		Fila quarta = construir(4);
		inserir(quarta,2);
		inserir(quarta,4);
		inserir(quarta,6);
		inserir(quarta,80);
		System.out.println();

		Fila quinta = merge(terceira, quarta);

		System.out.println();

		imprimir(quinta);

	}

	public static Fila merge(Fila a, Fila b) {
		int na = tamanho(a);
		int nb = tamanho(b);
		int nc = na + nb;

		Fila c = new Fila(nc);
		int i = 0;
		int j = 0;
		while (i < na && j < nb) {
			if (dado(a)[i] < dado(b)[j]) {
				inserir(c, dado(a)[i++]);
			} else {
				inserir(c, dado(b)[j++]);
			}
		}
		while (i < na) {
			inserir(c, dado(a)[i++]);
		}
		while (j < nb) {
			inserir(c, dado(b)[j++]);
		}

		return c;
	}

	public static void imprimir(Fila f) {
		f.imprimir();
	}

	public static Fila construir(int limite) {
		return new Fila(limite);
	}

	public static void inserir(Fila f, int valor) {
		f.inserir(valor);
	}

	public static void cheia(Fila f) {
		if (f.verificacheio()) {
			System.out.println("Fila não está cheia");
		} else {
			System.out.println("Fila cheia");
		}
	}

	public static void vazio(Fila f) {
		if (f.verificavazio()) {
			System.out.println("Fila vazia");
		} else {
			System.out.println("Fila não está vazia");
		}
	}

	public static void remove(Fila f) {
		f.pop();
	}

	public static int primeiro(Fila f) {
		return f.first();
	}

	public static int ultimo(Fila f) {
		return f.last();
	}

	public static int tamanho(Fila f) {
		return f.size();
	}

	public static int[] dado(Fila f) {
		return f.data();
	}

}
