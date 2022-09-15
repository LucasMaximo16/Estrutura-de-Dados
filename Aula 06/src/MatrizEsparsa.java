
public class MatrizEsparsa {

	// armazena valor (matriz)

	private static final int DIVISOR = 3;
	private NoAgrupador cabeca = null;

	// METODOS DA CLASSE

	public void inserir(int numero) {

		NoAgrupador ponteiroNoAgrupador = null;
		No ponteiroNo = null;

		// PROCURAR VARIAVEIS
		int resto = 0;
		resto = (numero % DIVISOR);

		ponteiroNoAgrupador = cabeca;

		while (ponteiroNoAgrupador != null) {
			if (ponteiroNoAgrupador.getResto() == resto) {
				break;
			}
			ponteiroNoAgrupador = ponteiroNoAgrupador.getProximoNoAgrupador();
		}

		// CRIAR UM NOVO NÓ AGRUPADOR NO CASO DE ELE NÃO EXISTIR
		if (ponteiroNoAgrupador == null) {

			ponteiroNoAgrupador = new NoAgrupador(resto, null, cabeca);
			cabeca = ponteiroNoAgrupador;
		}

		// INSERIR UM NOVO NÓ
		ponteiroNo = new No(numero, ponteiroNoAgrupador.getProximoNo());
		ponteiroNoAgrupador.setProximoNo(ponteiroNo);

	}

	public void mostrar() {
		NoAgrupador ponteiroNoAgrupador = null;
		No ponteiroNo = null;

		// Navegação
		ponteiroNoAgrupador = cabeca;
		while (ponteiroNoAgrupador != null) {
			System.out.print("Resto" + ponteiroNoAgrupador.getResto() + ": ");
			ponteiroNo = ponteiroNoAgrupador.getProximoNo();

			while (ponteiroNo != null) {
				System.out.print(ponteiroNo.getNumero() + "\t");
				ponteiroNo = ponteiroNo.getProximo();
			}
			System.out.println();
			ponteiroNoAgrupador = ponteiroNoAgrupador.getProximoNoAgrupador();
		}

	}

	public void excluir(int numero) {
		NoAgrupador ponteiroNoAgrupador = null;
		No ponteiroNo = null;

		// PROCURAR VARIAVEIS
		int resto = 0;
		resto = (numero % DIVISOR);

		ponteiroNoAgrupador = cabeca;

		while (ponteiroNoAgrupador != null) {
			if (ponteiroNoAgrupador.getResto() == resto) {
				break;
			}
			ponteiroNoAgrupador = ponteiroNoAgrupador.getProximoNoAgrupador();
			
			//procurar o no se ebcontrou o nó agregador
			if(ponteiroNoAgrupador != null) {
				ponteiroNo = ponteiroNoAgrupador.getProximoNo();
				
				if(ponteiroNo != null) {
					if(ponteiroNo.getNumero() == numero) {
						ponteiroNoAgrupador.setProximoNo(ponteiroNo.getProximo());
					}else {
						while((ponteiroNo != null) && (ponteiroNo.getProximo() != null)){
							if(ponteiroNo.getProximo().getNumero() == numero) {
								ponteiroNo.setProximo(
										ponteiroNo.getProximo().getProximo());
							}
							ponteiroNo = ponteiroNo.getProximo();
						}
					}
				}
			}
		}
	}
}