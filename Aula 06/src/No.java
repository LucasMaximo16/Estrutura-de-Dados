
public class No {

	// propriedade s da classe
	private int numero = 0;
	private No proximo = null;

	// METODOS CONSTRUTORES DA CLASSE

	public No() {
		super();
	}

	public No(int numero, No proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}

	// METODOS GET/SET DA CLASSE

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

}
