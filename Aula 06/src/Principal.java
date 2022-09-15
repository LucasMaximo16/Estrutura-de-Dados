
public class Principal {

	public static void main(String[] args) {
		MatrizEsparsa objMatrizEsparsa = new MatrizEsparsa();

		for(int i =0 ; i < 1000 ; i++) {
			objMatrizEsparsa.inserir(i);
		}

		objMatrizEsparsa.mostrar();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		for(int i = 0; i < 100 ; i++) {
			if ((i % 2) == 0) {
				objMatrizEsparsa.excluir(i);
			}
		}
		
		objMatrizEsparsa.mostrar();
		
	}
}
