
public class NoAgrupador {

	// PROPRIEDADES DA CLASSE
	private int resto = 0;
	private No proximoNo = null;
	private NoAgrupador proximoNoAgrupador = null;

	public NoAgrupador() {
		super();
	}

	public NoAgrupador(int resto, No proximoNo, NoAgrupador proximoNoAgrupador) {
		super();
		this.resto = resto;
		this.proximoNo = proximoNo;
		this.proximoNoAgrupador = proximoNoAgrupador;
	}

	public int getResto() {
		return resto;
	}

	public void setResto(int resto) {
		this.resto = resto;
	}

	public No getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}

	public NoAgrupador getProximoNoAgrupador() {
		return proximoNoAgrupador;
	}

	public void setProximoNoAgrupador(NoAgrupador proximoNoAgrupador) {
		this.proximoNoAgrupador = proximoNoAgrupador;
	}

}
